package com.example.myapplication

data class Producto(
    val id: Int,
    val nombre: String,
    val tipo: String,
    val precio: Double,
    val imagenResId: Int,
    val descripcion: String
)

val productosDummy = listOf(
    Producto(
        id = 1,
        nombre = "Explorer Herbicida",
        tipo = "Herbicida",
        precio = 18.50,
        imagenResId = R.drawable.image1,
        descripcion = "El agroquímico EXPLORER® (de la empresa Afecor) es un herbicida de contacto no selectivo diseñado principalmente para el control post-emergente de malezas difíciles o resistentes en cultivos de maíz y banano.\n\nIngrediente Activo: Glufosinato de amonio (200 g/L).\nModo de Acción: Interfiere la enzima glutamina sintetasa, provocando la muerte foliar completa de la maleza en pocos días.\nPresentaciones: Frascos de 500 mL, 1L, Galón (3.785L), bidón de 20L y tanques de 200L."
    ),
    Producto(
        id = 2,
        nombre = "Mixpax",
        tipo = "Fertilizante",
        precio = 24.00,
        imagenResId = R.drawable.image2,
        descripcion = "Fertilizante especial para el cultivo de cacao. Proporciona los nutrientes esenciales necesarios para potenciar el crecimiento vegetativo, floración y desarrollo óptimo de los frutos de cacao."
    ),
    Producto(
        id = 3,
        nombre = "Bomba Cifran (Sirfran)",
        tipo = "Equipo",
        precio = 85.00,
        imagenResId = R.drawable.image3,
        descripcion = "Bomba de fumigación Sirfran (comúnmente llamada 'Cifran'). Equipo agrícola de alta calidad. Modelos destacados a batería de litio con tanque de 16 litros y autonomía de hasta 10 horas de trabajo continuo con presión constante. También disponible en versiones manuales (20L) y a motor/nebulizadora."
    ),
    Producto(
        id = 4,
        nombre = "Bomba de Fumigación Tipo Mochila",
        tipo = "Equipo",
        precio = 45.00,
        imagenResId = R.drawable.image4,
        descripcion = "Bomba de fumigación portátil que se carga en la espalda para pulverizar agroquímicos líquidos de forma uniforme sobre los cultivos.\n\nTipos: Manuales, a batería y a motor.\nCapacidades: Tanques plásticos de 16 y 20 litros."
    ),
    Producto(
        id = 5,
        nombre = "Metsulfuron",
        tipo = "Herbicida",
        precio = 12.00,
        imagenResId = R.drawable.image5,
        descripcion = "Metsulfurón (o Metsulfurón-metil) es un herbicida sistémico y selectivo para el control post-emergente de malezas de hoja ancha, plantas leñosas y arbustos perennes. Actúa inhibiendo la enzima ALS, deteniendo el crecimiento de la maleza en 1 a 3 semanas.\n\nPresentaciones: Sobres de 10 a 15 g, y frascos de 100 g, 500 g o 1 kg."
    ),
    Producto(
        id = 6,
        nombre = "Enraizaste Más Raíz",
        tipo = "Bioestimulante",
        precio = 15.00,
        imagenResId = R.drawable.image6,
        descripcion = "Bioestimulante enraizador MÁS RAÍZ. Se comercializa en presentaciones líquidas adaptadas tanto para pequeños agricultores como para producciones extensivas.\n\nPresentaciones: Frasco de 500 mL (ideal para huertos pequeños o semilleros) y Frasco de 1 Litro (para tratamientos estándar en cultivos hortícolas o frutales)."
    ),
    Producto(
        id = 7,
        nombre = "Geramilaq",
        tipo = "Herbicida",
        precio = 22.50,
        imagenResId = R.drawable.image7,
        descripcion = "Herbicida selectivo y de contacto utilizado principalmente en el cultivo de arroz para el control pre y post-emergente de malezas gramíneas y de hoja ancha.\n\nIngrediente Activo: Pendimethalin (Pendimetalina al 40%).\nPresentaciones: Concentrado emulsionable en envases de 1 Litro y bidones/galones de 9.5 Litros."
    )
)
