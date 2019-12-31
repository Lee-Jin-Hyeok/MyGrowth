var submit = document.getElementById("search_button");

submit.onclick = function() {
    document.searching.action = "./searching2.jsp";
    document.searching.method = "post";
    document.searching.submit();
}