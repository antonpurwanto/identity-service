insert into i_permission (id, name, description)
VALUES ('p001','USER_READ', 'Read Data User');

insert into i_permission (id, name, description)
VALUES ('p002','USER_WRITE', 'Modify Data User');

insert into i_permission (id, name, description)
VALUES ('p003','GROUP_READ', 'Read Data Group');

insert into i_permission (id, name, description)
VALUES ('p004','GROUP_WRITE', 'Write Data Group');

insert into i_group (id, name, description)
VALUES ('g001','Super User', 'Super user has all permissions');

insert into i_user(id, username, fullname, email, active)
VALUES ('u001', 'user001', 'User 001', 'u001@example.com', true);

insert into i_user_password (id, id_user, password)
VALUES ('ip001','u001','test1234');

insert into i_user_group(id_user, id_group) VALUES ('u001','g001');

insert into i_group_permission(id_group, id_permission)
VALUES ('g001','p001');

insert into i_group_permission(id_group, id_permission)
VALUES ('g001','p002');

insert into i_group_permission(id_group, id_permission)
VALUES ('g001','p003');

insert into i_group_permission(id_group, id_permission)
VALUES ('g001','p004');