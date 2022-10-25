SELECT * 
FROM dbo.tb_personas p
JOIN dbo.tb_firmas f 
    ON p.persona_codigo = f.persona_codigo
JOIN dbo.tb_lineas l
    ON f.linea_codigo = l.linea_codigo
JOIN dbo.tb_hojas h
    ON l.hoja_codigo = h.hoja_codigo
JOIN dbo.tb_libros lb
    ON h.libro_codigo = lb.libro_codigo
JOIN dbo.tb_mesas m
    ON lb.mesa_codigo = m.mesa_codigo
JOIN dbo.tb_centrosDeVotacion cv
    ON m.centroDeVotacion_codigo = cv.centroDeVotacion_codigo
JOIN dbo.tb_direcciones d
    ON cv.direccion_codigo = d.direccion_codigo
JOIN dbo.tb_municipios mu
    ON d.municipio_codigo = mu.municipio_codigo
JOIN dbo.tb_departamentos dep
    ON mu.departamento_codigo = dep.departamento_codigo
WHERE p.persona_dpi='1234565452365'
