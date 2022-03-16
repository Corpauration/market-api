package fr.corpauration.models

import java.util.*

typealias ProductId = UUID
typealias Quantity = Int
typealias Amount = Double


data class Price(
    val amount: Amount
)

data class Product(
    val id: ProductId,
    val name: String,
    val quantity: Quantity,
    val price: Price,
    val category: ProductCategory
)

data class ProductCategory(
    val name: String
)

data class ProductCommand(
    val name: String,
    val quantity: Int,
    val price: Double,
    val category: String
)