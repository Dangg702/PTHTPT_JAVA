package com.gpcoder.ws;
 
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

//SOAPBinding xđ WS nà theo RPC style hoặc Document style
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserService {
	//WebMethod đánh dấu đây là các phương thức của WS
    @WebMethod
    int insert(User user);
 
    @WebMethod
    boolean update(User user);
 
    @WebMethod
    boolean delete(int id);
 
    @WebMethod
    User get(int id);
 
    @WebMethod
    User[] getAll();
}
