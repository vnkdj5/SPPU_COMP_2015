<?php
if(isset($_POST['submit']))
{
    //<?xml version=\"1.0\" encoding=\"utf-8\" ? >
$xml = new DomDocument("1.0","UTF-8");
$xml->load("data.xml");
$rootElement=$xml->getElementsByTagName("document")->item(0);
$dataTag=$xml->createElement("customer");
//$xml->appendChild($dataTag);
//-------Creating a simple string from array of languages
$arr=$_POST["lang"];
$langs="";
foreach($arr as $element)
{
    $langs=$langs.$element.", ";
}

    $name=$xml->createElement("Name", $_POST['cname']);
    $address=$xml->createElement("Address", $_POST['caddress']);
    $gender=$xml->createElement("Gender", $_POST['gender']);
    $langs=$xml->createElement("Lang", $langs);
    $city=$xml->createElement("City", $_POST['city']);

    $dataTag->appendChild($name);
    $dataTag->appendChild($address);
    $dataTag->appendChild($gender);
    $dataTag->appendChild($langs);
    $dataTag->appendChild($city);
    $rootElement->appendChild($dataTag);

    $xml->save("data.xml");
    

    //Read the contents of XML File for printing
    if(file_exists('./data.xml'))
    {
        $myXML = file_get_contents('./data.xml');
        $xml = new SimpleXMLElement($myXML);
        $xmlpretty = $xml->asXML();

        // pretty print the XML in browser
        header('content-type: text/xml');
        echo $xmlpretty;
    }

}
?>
