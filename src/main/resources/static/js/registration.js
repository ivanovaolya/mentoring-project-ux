$(document).ready(function() {

    $("#registration").submit(function(event) {
		event.preventDefault(); // prevent the form from submitting via the browser
		ajaxPost();
	});

    function ajaxPost(){
    	var formData = {
    		email : $("#email").val(),
    		password :  $("#password").val(),
    		confirmPassword :  $("#confirmPassword").val()
    	}

		$.ajax({
        			type : "POST",
        			contentType : "application/json",
        			url : window.location.origin + "/users/register",
        			data : JSON.stringify(formData),
        			dataType : 'json',
        			success : function(result) {
        				if (result.status == "CREATED") {
                           $("#registrationResult").addClass("alert alert-success");
                           $("#registrationResult").html("Registered successfully");
        				}
        			},
        			error : function(e) {
                        $("#registrationResult").addClass("alert alert-danger");
                        $("#registrationResult").html("<strong>Registration failed</strong>. " + e.responseText);
        			}
        		});

    	resetData();
    }

    function resetData(){
    	$("#email").val("");
    	$("#password").val("");
    	$("#confirmPassword").val("");
    }
})