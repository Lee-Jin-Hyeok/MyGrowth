var login_btn = document.getElementsByClassName("login_join")[0];
var join_btn = document.getElementsByClassName("login_join")[1];

var login_modal = document.getElementsByClassName("modal")[0];
var join_modal = document.getElementsByClassName("modal")[1];

var close_login_btn = document.getElementsByClassName("close")[0];
var close_join_btn = document.getElementsByClassName("close")[1];

login_btn.onclick = function() {
    login_modal.style.display = "block";
}

join_btn.onclick = function() {
    join_modal.style.display = "block";
}

function close_modal() {
    login_modal.style.display = "none";
    join_modal.style.display = "none";
}

close_login_btn.onclick = close_modal;
close_join_btn.onclick = close_modal;



var non_check_id = document.getElementById("non-check_id");
var check_id = document.getElementById("check_id");
var join_text_id_check = document.getElementById("join_text_id_check");

join_text_id_check.onclick = function() {
    non_check_id.style.display = "none";
    check_id.style.display = "block";
}

var non_check_email = document.getElementById("non_check_email");
var check_email = document.getElementById("check_email");
var join_text_email_check = document.getElementById("join_text_email_check");

join_text_email_check.onclick = function() {
    non_check_email.style.display = "none";
    check_email.style.display = "block";
}