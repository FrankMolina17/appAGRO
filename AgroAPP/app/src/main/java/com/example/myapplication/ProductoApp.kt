package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

sealed class Pantalla {
    object Home : Pantalla()
    object Catalogo : Pantalla()
    data class Detalle(val producto: Producto) : Pantalla()
}

@Composable
fun ProductoApp() {
    var pantallaActual by remember { mutableStateOf<Pantalla>(Pantalla.Home) }

    when (val pantalla = pantallaActual) {
        is Pantalla.Home -> {
            ProductoHomeScreen(
                onVerCatalogoClick = {
                    pantallaActual = Pantalla.Catalogo
                }
            )
        }
        is Pantalla.Catalogo -> {
            ProductoCatalogoScreen(
                productos = productosDummy,
                onProductoClick = { producto ->
                    pantallaActual = Pantalla.Detalle(producto)
                },
                onBackClick = {
                    pantallaActual = Pantalla.Home
                }
            )
        }
        is Pantalla.Detalle -> {
            ProductoDetalleScreen(
                producto = pantalla.producto,
                onBackClick = {
                    pantallaActual = Pantalla.Catalogo
                }
            )
        }
    }
}
