ALTER TABLE car DROP CONSTRAINT FK_car_user_id
ALTER TABLE book DROP CONSTRAINT FK_book_user_id
ALTER TABLE user_info DROP CONSTRAINT FK_user_info_car_id
ALTER TABLE password_details DROP CONSTRAINT FK_password_details_user_id
ALTER TABLE user_project_x DROP CONSTRAINT FK_user_project_x_user_id
ALTER TABLE user_project_x DROP CONSTRAINT FK_user_project_x_project_id
DROP TABLE project CASCADE
DROP TABLE car CASCADE
DROP TABLE book CASCADE
DROP TABLE user_info CASCADE
DROP TABLE password_details CASCADE
DROP TABLE user_project_x CASCADE
DELETE FROM SEQUENCE WHERE SEQ_NAME = 'SEQ_GEN'
DROP SEQUENCE user_seq
