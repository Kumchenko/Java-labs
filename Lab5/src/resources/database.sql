--
-- PostgreSQL database dump
--

-- Dumped from database version 15.2
-- Dumped by pg_dump version 15.2

-- Started on 2023-05-12 17:45:57

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 16398)
-- Name: student; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.student (
    id integer NOT NULL,
    surname character varying(50),
    name character varying(50),
    patronymic character varying(50),
    "recordBookId" integer,
    birthday date
);


ALTER TABLE public.student OWNER TO postgres;

--
-- TOC entry 3318 (class 0 OID 16398)
-- Dependencies: 215
-- Data for Name: student; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.student (id, surname, name, patronymic, "recordBookId", birthday) FROM stdin;
1	Іванов	Олександр	Вікторович	144121	2003-05-01
2	Петрова	Марія	Олександрівна	144122	2003-08-02
3	Сидорова	Ірина	Василівна	144123	2002-12-13
4	Коваленко	Андрій	Сергійович	144124	2003-11-04
5	Ковальчук	Віталій	Олегович	144125	2003-01-23
6	Шевченко	Олена	Петрівна	144126	2003-09-12
7	Мельник	Наталія	Володимирівна	144127	2003-07-31
8	Бойко	Максим	Ігорович	144128	2003-12-15
9	Козак	Анна	Олександрівна	144129	2003-03-08
10	Марченко	Олексій	Ігорович	144130	2003-10-19
11	Василенко	Юлія	Петрівна	144131	2003-04-17
12	Олійник	Ірина	Миколаївна	144132	2003-07-20
13	Кумченко	Кирило	Володимирович	144133	2003-08-05
14	Соколова	Марина	Сергіївна	144134	2003-12-11
15	Литвиненко	Денис	Валентинович	144135	2003-02-26
16	Романов	Олег	Іванович	144136	2003-08-09
17	Жукова	Анастасія	Григорівна	144137	2003-05-08
18	Павленко	Юлія	Михайлівна	144138	2002-11-27
19	Кравченко	Віктор	Генадійович	144139	2003-01-29
20	Ткачук	Дмитро	Васильович	144140	2003-05-13
\.


--
-- TOC entry 3173 (class 2606 OID 16404)
-- Name: student recordBookId_unique; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT "recordBookId_unique" UNIQUE ("recordBookId");


--
-- TOC entry 3175 (class 2606 OID 16402)
-- Name: student student_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_pkey PRIMARY KEY (id);


-- Completed on 2023-05-12 17:45:57

--
-- PostgreSQL database dump complete
--

