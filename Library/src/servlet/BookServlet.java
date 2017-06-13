package servlet;


	import java.io.IOException;   
	import javax.servlet.RequestDispatcher; 
	import javax.servlet.ServletException; 
	import javax.servlet.http.HttpServlet;  
	import javax.servlet.http.HttpServletRequest; 
	import javax.servlet.http.HttpServletResponse; 
	import model.Book;;   
	public class BookServlet extends HttpServlet  {
		private static final long serialVersionUID = 1L;   
		public void destroy() {   
		super.destroy(); // Just puts "destroy" string in log   // Put your code here   
	}    
	public void doGet(HttpServletRequest request, HttpServletResponse response)      throws ServletException, IOException {       
	doPost(request,response); 
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)     throws ServletException, IOException {     
		String url = "error.jsp";    
		response.setContentType("text/html");   
		response.setCharacterEncoding("UTF-8");   
		Book book = new Book();    
		String Id = request.getParameter("Id").trim();   
		String Member = request.getParameter("Member").trim();
		if(Id!=null){    
			book=BookDatabase.QueryInfo(number);    
		if(book.getNumber()!=null){     
			url="queryshow.jsp";      
			request.setAttribute("number", book.getNumber());     
			request.setAttribute("name", book.getName());     
			request.setAttribute("author", book.getAuthor());     
			request.setAttribute("chubanshe", book.getChubanshe());     
			request.setAttribute("jiage", book.getJiage());     
			request.setAttribute("shuliang", 
			book.getShuliang());     }    
		else{         
			request.setAttribute("message", "查询错误，输入正确的书号！");    }    }          
			RequestDispatcher rd=request.getRequestDispatcher(url);    
			rd.forward(request, response);   
			return;   
			}   
	 public void init() throws ServletException {   // Put your code here  
	} 
	 }

