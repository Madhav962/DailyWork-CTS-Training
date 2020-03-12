function sayHello() {
		document.write("<h1> Hello Good Afternoon</h1>");
		document.write("Today date is" + new Date() + "</h1>")
	}
	function validate() {
		var name = document.lf.userName.value.trim();
		var password = document.lf.password.value.trim();
		if (name == "") {
			alert("UserName should not be empty");
			return false;

		}
		if (password == "") {
			alert("Password should not be empty");
			return false;
		}

	}