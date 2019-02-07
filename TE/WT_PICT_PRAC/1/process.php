<?php
if(isset($_POST['submit']))
{
    //<?xml version=\"1.0\" encoding=\"utf-8\" ? >
$xml = new SimpleXMLElement("<?xml version=\"1.0\" encoding=\"utf-8\" ?><customer></customer>");

//-------Creating a simple string from array of languages
$arr=$_POST["lang"];
$langs="";
foreach($arr as $element)
{
    $langs=$langs.$element.", ";
}

    $xml->addChild('Name', $_POST['cname']);
    $xml->addChild('Address', $_POST['caddress']);
    $xml->addChild('Gender', $_POST['gender']);
    $xml->addChild('Lang', $langs);
    $xml->addChild('City', $_POST['city']);
    $asXML = $xml->asXML();
    $file = fopen("data.xml","w+"); //Write data to file 
    //Note run Command "chmod 777 ." in current directory if permission denied error occurs
    fwrite($file,$asXML);
    fclose($file); 
    print_r(error_get_last());

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
