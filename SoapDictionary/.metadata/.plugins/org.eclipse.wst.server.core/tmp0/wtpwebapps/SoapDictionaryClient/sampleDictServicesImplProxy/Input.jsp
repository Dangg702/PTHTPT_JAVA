<%@page contentType="text/html;charset=UTF-8"%>
<HTML>
<HEAD>
<TITLE>Inputs</TITLE>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.2/css/bootstrap.min.css">

<style>
	body {
		margin: 0;
		padding: 0;
		font-family: Arial, sans-serif;
	}
	
    header {
        background-color: #1877f2;
    }
    header h3 {
        color: white;
        text-align: left;
        padding: 20px 50px 20px;
    }
    .title {
        text-align: center;
        padding: 100px 50px 50px;
        color: #1877f2;
    }

    .group-position {
        width: 70%;
        position: relative;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
    }

    .input-field {
        position: absolute;
        width: 100%;
        font-size: 30px;
        padding: 10px;
    }
    .btn-search{
        background-color: #1877f2;
        color: white;
        width: 200px;
        font-size: 30px;
        font-weight: 400;
        padding: 10px;
        cursor: pointer;
    }
	
	form label {
		display: block;
		margin-bottom: 10px;
	}
	
	footer {
		background-color: #ccc;
		color: #666;
		padding: 10px;
		text-align: center;
        font-size: 18px;
	}
	

	
</style>

</HEAD>
<BODY>

	<%
		String method = request.getParameter("method");
		int methodID = 0;
		if (method == null)
			methodID = -1;

		boolean valid = true;

		if (methodID != -1)
			methodID = Integer.parseInt(method);
		switch (methodID) {

		case 1:
			valid = false;
	%>
	
		<header>
        <h3>SOAP Web Services</h3>
    </header>

    <main>
        <h1 class = "title">TỪ ĐIỂN ANH - VIỆT</h1>

        <FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
            <INPUT TYPE="HIDDEN" NAME="method"
                VALUE="<%=org.eclipse.jst.ws.util.JspUtils.markup(method)%>">

                <div class="input-group mb-3 mt-3 group-position">
                    <div class="input-group mb-3">
                        <input class="form-control form-control-lg input-field" type="text" id="search" name="word">
                        <button type="submit" VALUE="Invoke" class="btn btn-outline-success btn-search">Tra từ</button> 
                      </div>
                </div>
        </FORM>	
    </main>

    <footer>
        <p>
            &copy; 2023 Từ điển Anh - Việt.</a>
        </p>
    </footer>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.0.2/js/bootstrap.bundle.min.js">
		</script>
	</div>

	<%
		break;
		}
		if (valid) {
	%>
		<h1 style="color: blue; text-align: center; margin-top: 200px;" >
			Chọn Một Phương Pháp Để Kiểm Tra!!!
		</h1>
	<%
		}
	%>

</BODY>
</HTML>
