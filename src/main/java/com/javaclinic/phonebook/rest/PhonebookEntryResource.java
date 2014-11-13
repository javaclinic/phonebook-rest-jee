package com.javaclinic.phonebook.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.javaclinic.phonebook.dao.PhonebookEntryDao;
import com.javaclinic.phonebook.model.PhonebookEntry;

@Stateless
@Path("/entries")
public class PhonebookEntryResource {

    private static final Logger LOGGER = Logger.getLogger(PhonebookEntryResource.class.getCanonicalName());

    @EJB
    private PhonebookEntryDao dao;

    public PhonebookEntryResource() {
        LOGGER.finer("Instantiating PhonebookEntryResource instance.");
    }

    @PostConstruct
    public void init() {
        LOGGER.finer("Initializing PhonebookEntryResource instance.");
    }

    @PreDestroy
    public void finalize() {
        LOGGER.finer("Finalizing PhonebookEntryResource instance.");
    }


    @GET
    public Response getPhonebookEntries() {
        LOGGER.finer("Servicing PhonebookEntryResource.getPhonebookEntries() business request.");
        List<PhonebookEntry> list = dao.list();
        return Response.ok(list).build();
    }

    @GET
    @Path("/{id}")
    public Response getPhonebookEntry(@PathParam("id") Integer id) {
        LOGGER.finer("Servicing PhonebookEntryResource.getPhonebookEntry(id) business request.");
        PhonebookEntry pe = dao.find(id);
        return Response.ok(pe).build();
    }

    @POST
    public Response savePhonebookEntry(PhonebookEntry pe) {
        LOGGER.finer("Servicing PhonebookEntryResource.savePhonebookEntry(name,number,note) business request.");
        dao.save(pe);
        return Response.created(null).build();
    }

    @PUT
    @Path("/{id}")
    public PhonebookEntry updatePhonebookEntry(PhonebookEntry pe, @PathParam("id") Integer id) {
        LOGGER.finer("Servicing PhonebookEntryResource.updatePhonebookEntry(id,name,number,note) business request.");
        pe.setId(id);
        return dao.update(pe);
    }

    @DELETE
    @Path("/{id}")
    public PhonebookEntry deletePhonebookEntry(@PathParam("id") Integer id) {
        LOGGER.finer("Servicing PhonebookEntryResource.deletePhonebookEntry(id) business request.");
        PhonebookEntry pe = new PhonebookEntry(id,null,null,null);
        return dao.delete(pe);
    }

}
