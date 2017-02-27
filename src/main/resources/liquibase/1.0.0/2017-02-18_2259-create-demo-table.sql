--liquibase formatted sql
--changeset ilyina:1.0.0.create_demo.sql context:dev
CREATE TABLE demo (
  id BIGSERIAL,
  name TEXT NOT NULL,
  PRIMARY KEY (id)
);
--rollback drop table demo;

--changeset ilyina:1.0.0.fulfill_demo.sql context:dev
INSERT INTO demo (name) VALUES
  ('Test'),
  ('String'),
  ('Data');
--rollback delete from test1 where name in ('Test', 'String', 'Data');




