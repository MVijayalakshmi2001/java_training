select round(45.7892) from dual

CREATE TABLE vijim_product (product_id NUMBER(3) PRIMARY KEY, product_name VARCHAR2(20),price NUMBER(10,2))

INSERT INTO vijim_product VALUES(101,'tv',20000.00)

INSERT INTO vijim_product VALUES(102,'fridge',45000.00)

INSERT INTO vijim_product VALUES(103,'heater',2500.00)

INSERT INTO vijim_product VALUES(10,'laptop',50000.00)

CREATE TABLE viji_invoice (invoice_number NUMBER(5) PRIMARY KEY, customer_name VARCHAR2(20), quantity NUMBER(3),product_ref REFERENCES vijim_product(product_id))

INSERT INTO viji_invoice VALUES(201,'ramesh',2,101)

INSERT INTO viji_invoice VALUES(202,'santa',1,102)

INSERT INTO viji_invoice VALUES(203,'reya',3,103)

SELECT vp.product_id,vp.product_name,vp.price,vi.invoice_number,vi.customer_name,vi.quantity, vi.quantity* vp.price amount 
FROM vijim_product vp,viji_invoice vi 
WHERE vp.product_id = vi.product_ref


SELECT * FROM vijim_product

SELECT * FROM viji_invoice

SELECT * FROM vijim_product vp LEFT OUTER JOIN viji_invoice vi on vp.product_id=vi.product_ref

SELECT * FROM vijim_product vp RIGHT OUTER JOIN viji_invoice vi on vp.product_id=vi.product_ref

CREATE VIEW viji_product_view AS SELECT product_id,product_name FROM vijim_product

SELECT * FROM viji_product_view

INSERT INTO viji_product_view VALUES(106,'microwave')

SELECT * FROM user_views

SELECT view_name,text FROM user_views where view_name = 'VIJI_PRODUCT_VIEW'

CREATE INDEX viji_product_name_index on vijim_product(product_name)

CREATE TABLE viji1_catalogs (grade VARCHAR2(1) PRIMARY KEY,max_price NUMBER(10,2), min_price NUMBER(10,2))

INSERT INTO viji1_catalogs VALUES('S',2000,1000);

INSERT INTO viji1_catalogs VALUES('O',3000,2001);

INSERT INTO viji1_catalogs VALUES('b',4000,3001);

SELECT * from viji1_catalogs

SELECT p.product_name,p.price,c.grade
FROM vijim_product p,viji1_catalogs c
WHERE p.price BETWEEN c.min_price AND c.max_price

SELECT * FROM viji_bill

SELECT * FROM viji_seqe
SELECT b.bill_number,b.bill_date,b.amount FROM  VIJI_BILL a, VIJI_BILL b WHERE a.cust_ref=201 AND a.bill_date = b.bill_date

SELECT * FROM viji_student


