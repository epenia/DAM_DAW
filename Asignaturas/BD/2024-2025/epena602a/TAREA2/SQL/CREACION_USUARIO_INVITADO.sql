-- Creación del nuevo usuario invitado
CREATE USER C##INVITADO IDENTIFIED BY 12345678;

-- Concedemos permisos para connectar 
GRANT CONNECT, RESOURCE TO C##INVITADO;

-- REVOKE RESOURCE FROM C##INVITADO;

-- Concedemos todos los permisos sobre la tabla publicaciones del usuario c##endika
GRANT ALL ON C##ENDIKA.PUBLICACIONES TO C##INVITADO;