package com.learningjava.controller.admin.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.learningjava.model.NewModel;
import com.learningjava.service.INewService;
import com.learningjava.service.impl.NewService;
import com.learningjava.utils.HttpUtil;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = {"/api-admin-new"})
public class NewAPI extends HttpServlet {

    @Inject
    private INewService newService;

    private static final long serialVersionUID = -915988021506484384L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        newService=new NewService();

        ObjectMapper mapper = new ObjectMapper();
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        NewModel newModel =  HttpUtil.of(request.getReader()).toModel(NewModel.class);
//		newModel.setCreatedBy(((UserModel) SessionUtil.getInstance().getValue(request, "USERMODEL")).getUserName());
        newModel = newService.save(newModel);
        System.out.println(newModel);
        //mapper.writeValue(response.getOutputStream(), newModel);
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
