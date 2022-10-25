--INSERTAR DEPARTAMENTOS EN TB_DEPARTAMENTOS
INSERT INTO tb_departamentos VALUES 
    ('Jutiapa'),
    ('Chiquimula'),
    ('Jalapa'),
    ('Santa Rosa'),
    ('El progreso'),
    ('Guatemala'),
    ('Escuintla');

--INSERTAR MUNICIPIOS EN TB_MUNICIPIOS
INSERT INTO tb_municipios VALUES 
    ('Jutiapa', 1),
    ('Moyuta', 1),
    ('Monjas', 3),
    ('Jocotan', 2),
    ('Esquipulas', 2),
    ('Guastatoya', 5),
    ('El Jicaro', 5),
    ('El Progreso', 5),
    ('Cuilapa', 4),
    ('Barberena', 4),
    ('Casillas', 4),
    ('Palencia', 6),
    ('Santa Catarina Pinula', 6),
    ('Mixco', 6),
    ('Freijanes', 6),
    ('Escuintla', 7),
    ('La Democracia', 7),
    ('Masagua', 7),
    ('Iztapa', 7),
    ('Nueva Concepcion', 7);

--INSERTAR DIRECCIONES EN TB_DIRECCIONES
INSERT INTO tb_direcciones VALUES
    (-89.8667, 14.4333, 4032, 1867, 6452, 7895, 5),
    (-90.105411, 13.91513, 6512, 4548, 3235, 3321, 2),
    (-89.8666, 14.54, 2214, 2314, 421, 321, 3),
    (-89.3494, 14.82109, 2214, 5321, 1243, 3321, 4),
    (-89.3369, 14.5704, 823, 321, 3621, 1243, 5),
    (-90.0666, 14.85, 152, 362, 452, 326, 6),
    (-89.8943, 14.91331, 986, 645, 356, 781, 7),
    (-90.3, 14.28333, 861, 273, 391, 361, 8),
    (-90.2444, 14.41835, 4617, 328, 671, 613, 10),
    (-90.36666, 14.6666, 865, 945, 675, 542, 11),
    (-90.46214, 14.5661, 632, 236, 215, 512, 12),
    (-90.592, 14.6463, 211, 112, 255, 552, 13),
    (-90.44316, 14.46318, 884, 488, 554, 455, 14),
    (-90.7881, 14.30093, 951, 159, 357, 753, 15);

--INSERTAR DATOS EN TB_CENTROS DE VOTACION
INSERT INTO tb_centrosDeVotacion VALUES
    ('Escuela Federal', 1),
    ('Experimental', 3),
    ('Escuela de Comercio', 3),
    ('Montufar', 4),
    ('Escuela BL', 5),
    ('Escuela San Antonio', 6),
    ('INEB', 7),
    ('INED', 8),
    ('Salon Municipal', 9),
    ('INEBE PEMEM', 10),
    ('Colegio NISI', 11),
    ('CUM', 12),
    ('EFPEM', 13),
    ('Club los Arcos', 14),
    ('Escuela Barrio Miramar', 13),
    ('Parqueo Brasilia', 14);


--INSERTAR DATOS EN TB_MESAS
INSERT INTO tb_mesas VALUES
    (1),
    (2),
    (3),
    (4),
    (5),
    (6),
    (7),
    (8),
    (9),
    (10);

--INSERTAR DATOS EN TB_LIBROS
INSERT INTO tb_libros VALUES
    (1),
    (2),
    (3),
    (4),
    (5),
    (6),
    (7),
    (8),
    (9),
    (10);

--INSERTAR DATOS EN TB_HOJAS
INSERT INTO tb_hojas VALUES
    (1),
    (2),
    (3),
    (4),
    (5),
    (6),
    (7),
    (8),
    (9),
    (10);


--INSERTAR DATOS EN TB_LINEAS
INSERT INTO tb_lineas VALUES
    (1),                                                
    (2),
    (3),
    (4),
    (5),
    (6),
    (7),
    (8),
    (9),
    (10);


--INSERTAR DATOS EN TB_PERSONAS
INSERT INTO tb_personas VALUES
    ('1234565452365', 1, 'Walver', 'Omar', 'Arana', '', 'walver-foto', 'walver-firma', '2002-05-03', 1),
    ('6124565452458', 2, 'Jesus', 'Antonio', 'Barrera', 'Moran', 'antonio-foto', 'antonio-firma', '2001-04-02', 11),
    ('3498516122454', 3, 'Jesus', 'Antonio', 'Calderas', 'Lemus', 'jesus-foto', 'jesus-firma', '2001-10-11', 3),
    ('8378517542442', 4, 'Edwar', 'Alejandro', 'Castellanos', 'Portillo', 'edwar-foto', 'edwar-firma', '2001-01-14', 4),
    ('9638527411454', 5, 'Linda', 'Daniela', 'Castillo', 'Giron', 'daniela-foto', 'daniela-firma', '2002-07-06', 5),
    ('1598516122951', 6, 'Steven', 'Rene', 'Garcia', 'Payes', 'steven-foto', 'steven-firma', '2001-12-16', 6),
    ('3578526122753', 7, 'Victor', 'Daniel', 'Hernandez', 'Cruz', 'victor-foto', 'victor-firma', '2002-09-11', 7),
    ('6499436122617', 8, 'Jorge', 'Alfonso', 'Lopez', 'Garcia', 'jorge-foto', 'jorge-firma', '2001-10-24', 8),
    ('7541236122321', 9, 'Cristian', 'Eli', 'Luna', '', 'cristian-foto', 'cristian-firma', '2001-10-24', 9),
    ('2248876122663', 10, 'Steven', 'Oswaldo', 'Ramos', 'Hernandez', 'oswaldo-foto', 'oswaldo-firma', '2001-12-16', 10);

--INSERTAR DATOS EN TB_FIRMAS
INSERT INTO tb_firmas VALUES
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5),
    (6, 6),
    (7, 7),
    (8, 8),
    (9, 9),
    (10, 10);
