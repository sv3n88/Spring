insert into user_details(id, birth_date, name)
values
(10001, current_date(), 'Ranga'),
(10002, current_date(), 'Sven'),
(10003, current_date(), 'Test');

insert into post(id, description, user_id)
values
(20001, 'I want to learn AWS', 10001),
(20002, 'I want to learn cooking', 10001),
(20003, 'I want to learn DevOps', 10002),
(20004, 'I want to learn fitness', 10002),
(20005, 'I want to learn Multicloud', 10003);

