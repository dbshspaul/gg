package com.gg.rest;

import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.gg.model.Category;
import com.gg.model.SubCategory;
import com.gg.transaction.Ejb;

@Path("v1")
public class JaxRS {
	@SuppressWarnings("unused")
	@Context
	private UriInfo context;
	private Date date = new Date();
	@EJB
	private Ejb ejb;
	private StringWriter sw = new StringWriter();
	private JsonGeneratorFactory factory = Json.createGeneratorFactory(null);
	private JsonGenerator generator = factory.createGenerator(sw);

	/**
	 * Default constructor.
	 */
	public JaxRS() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Retrieves representation of an instance of JaxRS
	 * 
	 * @return an instance of String
	 */
	@GET
	@Produces("application/json")
	public String getJson() {
		return "sadssf";
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/category")
	public Response setCategory(@FormParam("name") String name, @FormParam("description") String description) {
		Response response = null;
		Category category = new Category();
		category.setActive(true);
		category.setCreatedDateTime(date);
		category.setName(name);
		category.setDescription(description);
		try {
			ejb.setData(category);
			response.status(HttpURLConnection.HTTP_OK).entity("success").build();
		} catch (Exception e) {
			throw new WebApplicationException(
					Response.status(HttpURLConnection.HTTP_BAD_REQUEST).entity("Invalid request").build());
		}
		return response;
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/subcategory")
	public Response setSubCategory(@FormParam("categoryId") int id, @FormParam("name") String name,
			@FormParam("description") String description) {
		Response response;
		try {
			Category category = ejb.getEntityById(id, Category.class);
			SubCategory subCategory = new SubCategory();
			subCategory.setActive(true);
			subCategory.setCategory(category);
			subCategory.setCreatedDateTime(date);
			subCategory.setDescription(description);
			subCategory.setName(name);
			ejb.setData(subCategory);
			generator.writeStartObject().write("asdsad", "sadsad").writeEnd().close();
			response = Response.status(HttpURLConnection.HTTP_OK).entity(sw.toString()).build();
		} catch (Exception e) {
			throw new WebApplicationException(
					response = Response.status(HttpURLConnection.HTTP_BAD_REQUEST).entity("Invalid request").build());
		}
		return response;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/category")
	public Response getCategories() {
		try {
			GenericEntity<List<Category>> entity = new GenericEntity<List<Category>>(
					ejb.getAllEntities(Category.class)) {
			};
			return Response.ok().entity(entity).build();
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(
					Response.status(HttpURLConnection.HTTP_BAD_REQUEST).entity("Invalid request").build());
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/subcategory")
	public Response getSubCategories() {
		try {
			GenericEntity<List<SubCategory>> entity = new GenericEntity<List<SubCategory>>(
					ejb.getAllEntities(SubCategory.class)) {
			};
			return Response.ok().entity(entity).build();
		} catch (Exception e) {
			e.printStackTrace();
			throw new WebApplicationException(
					Response.status(HttpURLConnection.HTTP_BAD_REQUEST).entity("Invalid request").build());
		}
	}

	/*********************************************************************************************************************/

	@Override
	protected void finalize() throws Throwable {
		generator.close();
		sw.close();
		super.finalize();
	}

}