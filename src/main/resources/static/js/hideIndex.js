window.onload = function loadPage(){
	var body = document.getElementById("body");
	body.style.transition = "background-color 0.5s";
	var image = document.getElementById("logo"); 
	image.style.opacity = "1";
	image.style.cursor="pointer";
}

function openPage()
{
	var body = document.getElementById("body");
	body.style.backgroundColor = "#FFFFFF";
	var image = document.getElementById("logo");
	image.style.transition = "opacity 0.5s";
	image.style.opacity = "0";
	image.style.cursor="default";
	
}
