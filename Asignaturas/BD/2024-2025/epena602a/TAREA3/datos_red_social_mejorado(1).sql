-- Insertar usuarios de ejemplo
INSERT INTO Usuarios (id_usuario, nombre, email, contrasena, fecha_creacion, foto_perfil) VALUES (1,'Ana López', 'ana.lopez@ejemplo.com', 'password123', TO_DATE('11-11-2024', 'DD-MM-YYYY'),'http://ejemplo.com/fotos/ana.jpg');
INSERT INTO Usuarios (id_usuario, nombre, email, contrasena, fecha_creacion, foto_perfil) VALUES (2,'Carlos García', 'carlos.garcia@ejemplo.com', 'password456', TO_DATE('11-11-2024', 'DD-MM-YYYY'),'http://ejemplo.com/fotos/carlos.jpg');
INSERT INTO Usuarios (id_usuario, nombre, email, contrasena, fecha_creacion, foto_perfil) VALUES (3,'Laura Martínez', 'laura.martinez@ejemplo.com', 'password789', TO_DATE('12-11-2024', 'DD-MM-YYYY'),'http://ejemplo.com/fotos/laura.jpg');
INSERT INTO Usuarios (id_usuario, nombre, email, contrasena, fecha_creacion, foto_perfil) VALUES (4,'Juan Pérez', 'juan.perez@ejemplo.com', 'password321', TO_DATE('13-11-2024', 'DD-MM-YYYY'),'http://ejemplo.com/fotos/juan.jpg');
INSERT INTO Usuarios (id_usuario, nombre, email, contrasena, fecha_creacion, foto_perfil) VALUES (5,'Lucía Fernández', 'lucia.fernandez@ejemplo.com', 'password654', TO_DATE('16-11-2024', 'DD-MM-YYYY'),'http://ejemplo.com/fotos/lucia.jpg');
-- Añade más usuarios según sea necesario

-- Insertar 50 publicaciones con contenido variado
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (1, 1, TO_DATE('11-11-2024', 'DD-MM-YYYY'), 'Hoy comparto mi primer post en esta red social. ¡Hola a todos!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (2, 2, TO_DATE('11-11-2024', 'DD-MM-YYYY'), 'Estoy encantado de unirme a esta comunidad. Aquí va una foto de mis vacaciones.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (3, 3, TO_DATE('12-11-2024', 'DD-MM-YYYY'), '¿Alguien recomienda buenos libros de programación?');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (4, 4, TO_DATE('13-11-2024', 'DD-MM-YYYY'), 'Acabo de completar mi primer maratón. ¡Qué experiencia tan increíble!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (5, 5, TO_DATE('16-11-2024', 'DD-MM-YYYY'), 'Hoy estoy compartiendo algunas ideas de diseño. ¿Qué opinan?');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (6, 1, TO_DATE('12-11-2024', 'DD-MM-YYYY'), 'Cociné una receta nueva hoy. ¿A quién le gustan los postres?');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (7, 2, TO_DATE('12-11-2024', 'DD-MM-YYYY'), 'Reflexionando sobre la importancia del ejercicio diario.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (8, 3, TO_DATE('13-11-2024', 'DD-MM-YYYY'), 'Estoy viendo una serie nueva, ¿recomendaciones de episodios?');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (9, 4, TO_DATE('14-11-2024', 'DD-MM-YYYY'), 'Aquí va una foto de mi mascota. ¡Es adorable!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (10, 5, TO_DATE('17-11-2024', 'DD-MM-YYYY'), '¿Alguien tiene consejos para mejorar la productividad?');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (11, 1, TO_DATE('18-11-2024', 'DD-MM-YYYY'), '¡Feliz viernes a todos! ¿Planes para el fin de semana?');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (12, 2, TO_DATE('18-11-2024', 'DD-MM-YYYY'), 'Publicando algunas ideas de arte digital. ¡Opiniones bienvenidas!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (13, 3, TO_DATE('18-11-2024', 'DD-MM-YYYY'), 'Estoy pensando en aprender un nuevo idioma, ¿sugerencias?');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (14, 4, TO_DATE('18-11-2024', 'DD-MM-YYYY'), 'Hoy fue un día productivo, completé varios proyectos.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (15, 5, TO_DATE('18-11-2024', 'DD-MM-YYYY'), 'Una gran noticia en el trabajo, ¡muy contenta!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (16, 1, TO_DATE('19-11-2024', 'DD-MM-YYYY'), 'Disfrutando de un café en una nueva cafetería de la ciudad.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (17, 2, TO_DATE('19-11-2024', 'DD-MM-YYYY'), 'Aquí comparto un artículo sobre desarrollo personal que encontré interesante.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (18, 3, TO_DATE('19-11-2024', 'DD-MM-YYYY'), '¿Cuál es su deporte favorito y por qué?');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (19, 4, TO_DATE('19-11-2024', 'DD-MM-YYYY'), 'Nueva ilustración completada. Me encantaría saber qué piensan.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (20, 5, TO_DATE('19-11-2024', 'DD-MM-YYYY'), 'Una tarde de cine con amigos, ¡gran manera de relajarse!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (21, 1, TO_DATE('20-11-2024', 'DD-MM-YYYY'), 'Escapada de fin de semana a la montaña. Aquí unas fotos.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (22, 2, TO_DATE('20-11-2024', 'DD-MM-YYYY'), '¿Alguien recomienda buenos podcasts para aprender historia?');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (23, 3, TO_DATE('20-11-2024', 'DD-MM-YYYY'), 'Preparando un proyecto nuevo, emocionado por comenzar.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (24, 4, TO_DATE('20-11-2024', 'DD-MM-YYYY'), 'Retomando la lectura de un clásico de la literatura.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (25, 5, TO_DATE('20-11-2024', 'DD-MM-YYYY'), 'Consejos para reducir el estrés en la vida diaria.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (26, 1, TO_DATE('21-11-2024', 'DD-MM-YYYY'), 'Mi canción favorita esta semana, ¿algún amante de la música aquí?');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (27, 2, TO_DATE('21-11-2024', 'DD-MM-YYYY'), 'Ideas para mejorar el trabajo en equipo, las comparto aquí.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (28, 3, TO_DATE('21-11-2024', 'DD-MM-YYYY'), '¡Ganas de aprender algo nuevo cada día!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (29, 4, TO_DATE('21-11-2024', 'DD-MM-YYYY'), 'Aquí comparto un dibujo en el que he estado trabajando.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (30, 5, TO_DATE('21-11-2024', 'DD-MM-YYYY'), 'Un brindis por las pequeñas alegrías de la vida.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (31, 1, TO_DATE('23-11-2024', 'DD-MM-YYYY'), 'Viajé a un sitio histórico, ¡aprendí muchísimo!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (32, 2, TO_DATE('23-11-2024', 'DD-MM-YYYY'), 'Hoy es un día para reflexionar sobre nuestras metas.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (33, 3, TO_DATE('23-11-2024', 'DD-MM-YYYY'), 'Sábado de descanso, ¡perfecto para recargar energías!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (34, 4, TO_DATE('23-11-2024', 'DD-MM-YYYY'), 'Estoy agradecido por todo lo que tengo.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (35, 5, TO_DATE('23-11-2024', 'DD-MM-YYYY'), '¡Qué gran día para una caminata al aire libre!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (36, 1, TO_DATE('25-11-2024', 'DD-MM-YYYY'), '¿Alguien ha probado meditación? ¡Los escucho!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (37, 2, TO_DATE('25-11-2024', 'DD-MM-YYYY'), 'Escuchando mi podcast favorito. ¡Qué bien informan!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (38, 3, TO_DATE('25-11-2024', 'DD-MM-YYYY'), 'Explorando nuevas ideas para escribir un blog.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (39, 4, TO_DATE('25-11-2024', 'DD-MM-YYYY'), '¿Quién quiere unirse a una carrera local? ¡Será divertido!');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (40, 5, TO_DATE('25-11-2024', 'DD-MM-YYYY'), 'Reencuentro con amigos después de tanto tiempo.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (41, 1, TO_DATE('26-11-2024', 'DD-MM-YYYY'), 'Publicación diaria de motivación: "Cree en ti".');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (42, 2, TO_DATE('26-11-2024', 'DD-MM-YYYY'), 'Aprendí algo interesante sobre historia hoy.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (43, 3, TO_DATE('26-11-2024', 'DD-MM-YYYY'), 'Disfrutando de un rato de ejercicio al aire libre.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (44, 4, TO_DATE('26-11-2024', 'DD-MM-YYYY'), 'Nuevas ideas para mis ilustraciones.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (45, 5, TO_DATE('26-11-2024', 'DD-MM-YYYY'), 'Un café con buena compañía.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (46, 1, TO_DATE('27-11-2024', 'DD-MM-YYYY'), 'Reflexionando sobre un libro que leí recientemente.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (47, 2, TO_DATE('27-11-2024', 'DD-MM-YYYY'), 'Emocionado por compartir los próximos proyectos.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (48, 3, TO_DATE('28-11-2024', 'DD-MM-YYYY'), 'Una aventura nueva comienza hoy.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (49, 4, TO_DATE('29-11-2024', 'DD-MM-YYYY'), 'Sábado de cine con amigos.');
INSERT INTO Publicaciones (id_publicacion, id_usuario, fecha_publicacion, contenido) VALUES (50, 5, TO_DATE('30-11-2024', 'DD-MM-YYYY'), 'Preparándome para una nueva semana llena de desafíos.');

-- Insertar datos en la tabla Comentarios
INSERT INTO Comentarios (id_comentario, id_publicacion, id_usuario, fecha_comentario, comentario) VALUES (1, 1, 2, TO_DATE('11-11-2024', 'DD-MM-YYYY'),'¡Bienvenida, Ana! Disfruta de esta comunidad.');
INSERT INTO Comentarios (id_comentario, id_publicacion, id_usuario, fecha_comentario, comentario) VALUES (2, 2, 3, TO_DATE('17-11-2024', 'DD-MM-YYYY'),'Esa foto es espectacular, Carlos. ¡Qué envidia!');
INSERT INTO Comentarios (id_comentario, id_publicacion, id_usuario, fecha_comentario, comentario) VALUES (3, 3, 1, TO_DATE('19-11-2024', 'DD-MM-YYYY'),'Recomiendo "Clean Code" de Robert C. Martin, es un clásico.');
INSERT INTO Comentarios (id_comentario, id_publicacion, id_usuario, fecha_comentario, comentario) VALUES (4, 4, 5, TO_DATE('21-11-2024', 'DD-MM-YYYY'),'¡Felicidades, Juan! Correr un maratón no es fácil.');
INSERT INTO Comentarios (id_comentario, id_publicacion, id_usuario, fecha_comentario, comentario) VALUES (5, 5, 4, TO_DATE('21-11-2024', 'DD-MM-YYYY'),'Me gusta mucho el estilo de tus diseños, Lucía.');
-- Se pueden añadir más comentarios según sea necesario 

-- Insertar datos en la tabla Relaciones (amistades)
INSERT INTO Relaciones (id_usuario1, id_usuario2, fecha_amistad) VALUES (1, 2, TO_DATE('11-11-2024', 'DD-MM-YYYY')); -- Ana y Carlos son amigos
INSERT INTO Relaciones (id_usuario1, id_usuario2, fecha_amistad) VALUES (2, 3, TO_DATE('13-11-2024', 'DD-MM-YYYY')); -- Carlos y Laura son amigos
INSERT INTO Relaciones (id_usuario1, id_usuario2, fecha_amistad) VALUES (3, 4, TO_DATE('13-11-2024', 'DD-MM-YYYY')); -- Laura y Juan son amigos
INSERT INTO Relaciones (id_usuario1, id_usuario2, fecha_amistad) VALUES (4, 5, TO_DATE('16-11-2024', 'DD-MM-YYYY')); -- Juan y Lucía son amigos
INSERT INTO Relaciones (id_usuario1, id_usuario2, fecha_amistad) VALUES (5, 1, TO_DATE('16-11-2024', 'DD-MM-YYYY')); -- Lucía y Ana son amigos
-- Añade más relaciones para completar un conjunto realista

-- Insertar datos en la tabla Mensajes
INSERT INTO Mensajes (id_mensaje, id_usuario_emisor, id_usuario_receptor, mensaje, fecha_envio) VALUES (1, 1, 2, 'Hola, Carlos. ¿Cómo estás?', TO_DATE('12-11-2024', 'DD-MM-YYYY'));
INSERT INTO Mensajes (id_mensaje, id_usuario_emisor, id_usuario_receptor, mensaje, fecha_envio) VALUES (2, 2, 1, '¡Hola Ana! Todo bien, gracias. ¿Y tú?', TO_DATE('13-11-2024', 'DD-MM-YYYY'));
INSERT INTO Mensajes (id_mensaje, id_usuario_emisor, id_usuario_receptor, mensaje, fecha_envio) VALUES (3, 3, 4, 'Hola Juan, ¿quieres salir a correr esta semana?', TO_DATE('17-11-2024', 'DD-MM-YYYY'));
INSERT INTO Mensajes (id_mensaje, id_usuario_emisor, id_usuario_receptor, mensaje, fecha_envio) VALUES (4, 4, 3, '¡Claro, Laura! Nos ponemos de acuerdo para el sábado.', TO_DATE('17-11-2024', 'DD-MM-YYYY'));
INSERT INTO Mensajes (id_mensaje, id_usuario_emisor, id_usuario_receptor, mensaje, fecha_envio) VALUES (5, 5, 1, 'Ana, necesito tu consejo sobre un diseño que estoy trabajando.', TO_DATE('17-11-2024', 'DD-MM-YYYY'));
-- Añade más mensajes para que haya un total de al menos 150

-- Verificación de la cantidad de datos insertados
-- (Opcional: Ejecuta estas consultas para verificar las cantidades de datos por tabla)

SELECT COUNT(*) AS Total_Usuarios FROM Usuarios;
SELECT COUNT(*) AS Total_Publicaciones FROM Publicaciones;
SELECT COUNT(*) AS Total_Comentarios FROM Comentarios;
SELECT COUNT(*) AS Total_Relaciones FROM Relaciones;
SELECT COUNT(*) AS Total_Mensajes FROM Mensajes;
