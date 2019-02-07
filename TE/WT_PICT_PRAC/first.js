function parseDoc()
{
var xmlParser, xmlDoc;
xmlParser=new DomParser();
var text = "<?xml version = '1.0' encoding='UTF-8'?>"+ "<customer>" +
"<name>Default</name>" +
"<address>Default</address>" +
"<gender>Default</gender>" +
"<language>Default</language>" +
"<city>Default</city>" + "</customer>";
xmlDoc=xmlParser.parseFromString(text,"text/xml");

xmlDoc.getElementsByTagName("name")[0].childNode[0].nodeValue=document.getElementById("name").value;


xmlDoc=getElementsByTagName("city"[0]).childNode[0].nodeValue=document.getElementById("city").value;

 xmlDoc=getElementsByTagName("mytaf")[0].childNode[0].nodeValue="HHIIIIII";

 var xmlString=new XMLSerializer().serializeToString(xmlDoc);
 alert(xmlString);

 download("file.xml",xmlString);
}

function download(filename, text)
{
	var element=document.createElement('a');
	element.setAttribute('href','data:text/xml,charset:utf-8,'+text);
	element.setAttribute('download', filename);
	element.style.display='none';
	document.body.appendChild(element);
	element.click();
	document.body.removeChild(element);
}