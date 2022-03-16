package fr.corpauration.resources

import fr.corpauration.models.Product
import fr.corpauration.models.ProductCategory
import fr.corpauration.models.ProductCommand
import fr.corpauration.models.ProductId
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
class ProductsResource {
    @GET
    suspend fun get() = ""

    @GET
    suspend fun getByCategory(@QueryParam("category") category: ProductCategory) = ""

    @POST
    suspend fun create(command: ProductCommand) = ""
}


@Path("/product/{id}")
@Produces(MediaType.APPLICATION_JSON)
class ProductResource {
    @GET
    suspend fun getById(@PathParam("id") id: ProductId) = ""
}