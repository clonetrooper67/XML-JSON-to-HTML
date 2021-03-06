
public class HTML {

    public static String basicInquiryMarkersOpenInit() {
        return "var basicInquiryMarkers = [[],";
    }
    
    public static String basicInquiryMarkersOpen() {
        return "var basicInquiryMarkers = [";
    }

    public static String basicInquiryMarkersClose() {
        return "];\n";
    }

    public static String workerCompMarkersOpenInit() {
        return "var workerCompMarkers = [[],";
    }
    
    public static String workerCompMarkersOpen() {
        return "var workerCompMarkers = [";
    }
    
    public static String workerCompMarkersClose() {
        return "];\n";
    }

    public static String completedWorkerCompMarkersOpenInit() {
        return "var completedWorkerCompMarkers = [[],";
    }
    
    public static String completedWorkerCompMarkersOpen() {
        return "var completedWorkerCompMarkers = [";
    }

    public static String completedWorkerCompMarkersClose() {
        return "];\n ";
    }
    
    public static String goodProgressInquiryMarkersOpenInit() {
        return "var goodProgressInquiryMarkers = [[],";
    }
    
    public static String goodProgressInquiryMarkersOpen() {
        return "var goodProgressInquiryMarkers = [";
    }

    public static String goodProgressInquiryMarkersClose() {
        return "];\n";
    }

    public static String potentialMarkersOpenInit() {
        return "var potentialMarkers = [[],";
    }
    
    public static String potentialMarkersOpen() {
        return "var potentialMarkers = [";
    }


    public static String potentialMarkersClose() {
        return "];\n";
    }

    public static String completedCustomerMarkersOpenInit() {
        return "var completedCustomerMarkers = [[],";
    }
    
    public static String completedCustomerMarkersOpen() {
        return "var completedCustomerMarkers = [";
    }

    public static String completedCustomerMarkersClose() {
        return "];\n";
    }

    public static String doctorOpenInit() {
        return "var doctorMarkers = [[],";
    }
    
    public static String doctorOpen() {
        return "var doctorMarkers = [";
    }

    public static String doctorClose() {
        return " ];\n";
    }

    public static String therapistOpenInit() {
        return "var therapistMarkers = [[],";
    }
    
    public static String therapistOpen() {
        return "var therapistMarkers = [";
    }

    public static String therapistClose() {
        return "			   \n"
                + "			   ];\n";
    }

    public static String nurseCaseManagerOpenInit() {
        return " var nurseCaseManagerMarkers = [[],";
    }
    
    public static String nurseCaseManagerOpen() {
        return " var nurseCaseManagerMarkers = [";
    }

    public static String nurseCaseManagerClose() {
        return " ]; \n";
    }

    public static String prosthetistOpenInit() {
        return " var prosthetistMarkers = [[],";
    }
    
    public static String prosthetistOpen() {
        return " var prosthetistMarkers = [";
    }

    public static String prosthetistClose() {
        return " ];\n";
    }

    public static String getHeader() {
        return "<!DOCTYPE html>\n"
                + "		<html>\n"
                + "		<head>\n"
                + "			<script type=\"text/javascript\"\n"
                + "			src=\"https://maps.googleapis.com/maps/api/js?v=3.exp&signed_in=true\">\n"
                + "		</script>\n"
                + "		<script type=\"text/javascript\">\n"
                + "\n";
    }

    public static String getFooter() {
        return "			function initialize() {\n"
                + "				var mapOptions = {\n"
                + "					zoom: 4,\n"
                + "					center: new google.maps.LatLng(40.866711, -101.465781)\n"
                + "				}\n"
                + "				var map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);\n"
                + "				var infoWindow =  new google.maps.InfoWindow({\n"
                + "					content: \"\"\n"
                + "				});\n"
                + "				setBasicInquiryMarkers(map, basicInquiryMarkers, infoWindow);\n"
                + "				setGoodProgressInquiryMarkers(map,  goodProgressInquiryMarkers, infoWindow);\n"
                + "				setWorkerCompMarkers(map, workerCompMarkers, infoWindow);\n"
                + "				setPotentialMarkers(map, potentialMarkers, infoWindow);\n"
                + "				setCompletedCustomerMarkers(map, completedCustomerMarkers, infoWindow);\n"
                + "				setDoctorMarkers(map, doctorMarkers, infoWindow);\n"
                + "                             setCompletedWorkerCompMarkers(map, completedWorkerCompMarkers, infoWindow);\n"
                + "				setTherapistMarkers(map, therapistMarkers, infoWindow);\n"
                + "                             setProsthetistMarkers(map, prosthetistMarkers, infoWindow);\n"
                + "				setNurseCaseManagerMarkers(map, nurseCaseManagerMarkers, infoWindow);\n"
                + "			}\n"
                + "             var basicInquiryMarkersArray = [];\n"
                + "             var completedWorkerCompMarkersArray = [];\n"
                + "             var workerCompMarkersArray = [];\n"
                + "             var goodProgressInquiryMarkersArray = [];\n"
                + "             var potentialMarkersArray = [];\n"
                + "             var completedCustomerMarkersArray = [];\n"
                + "	        var therapistMarkersArray = [];\n"
                + "	        var nurseCaseManagerMarkersArray = [];\n"
                + "	        var prosthetistMarkersArray = [];\n"
                + "	        var doctorMarkersArray = [];\n"
                + "			function bindInfoWindow(marker, map, infowindow, description) {\n"
                + "				google.maps.event.addListener(marker, 'click', function() {\n"
                + "					infowindow.setContent(description);\n"
                + "					infowindow.open(map, marker);\n"
                + "				});\n"
                + "			}"
                + "            		function workerCompMarkersSwitch(show){\n"
                + "		                // map.closeInfoWindow();\n"
                + "		                if (document.getElementById(show).checked==false) { // hide the marker\n"
                + "		                	for (var i=0; i<workerCompMarkersArray.length; i++) {\n"
                + "		                		workerCompMarkersArray[i].setVisible(false);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		                else { // show the marker again\n"
                + "		                	for (var i=0; i<workerCompMarkersArray.length; i++) {\n"
                + "		                		workerCompMarkersArray[i].setVisible(true);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		            }\n"
                + "	          function setDoctorMarkers(map, locations, infoWindow) {\n"
                + "					var shape = {\n"
                + "						coords: [1, 1, 1, 20, 18, 20, 18 , 1],\n"
                + "						type: 'poly'\n"
                + "					};\n"
                + "			                // Create an empty array to hold your workerComp markers\n"
                + "			                for (var i = 0; i < doctorMarkers.length; i++) {\n"
                + "\n"
                + "			                	var place = locations[i];\n"
                + "			                	var myLatLng = new google.maps.LatLng(place[1], place[2]);\n"
                + "			                	var marker = new google.maps.Marker({\n"
                + "			                		position: myLatLng,\n"
                + "			                		map: map,\n"
                + "			                		shape: shape,\n"
                + "			                		title: place[0],\n"
                + "			                		icon: \"http://alatheia.com/wp-content/uploads/doctor.png\"\n"
                + "			                	});\n"
                + "\n"
                + "			                    // Push each workerComp marker to the corresponding array\n"
                + "			                    doctorMarkersArray.push(marker);\n"
                + "			                    bindInfoWindow(marker, map, infoWindow, place[3]);\n"
                + "			                }\n"
                + "			            }"
                + "\n"
                + "		 function setWorkerCompMarkers(map, locations, infoWindow) {\n"
                + "		            	var shape = {\n"
                + "					coords: [17, 17, 34, 32],\n"
                + "					type: 'rect'\n"
                + "				};"
                + "                // Create an empty array to hold your workerComp markers\n"
                + "                for (var i = 0; i < workerCompMarkers.length; i++) {\n"
                + "\n"
                + "                	var place = locations[i];\n"
                + "                	var myLatLng = new google.maps.LatLng(place[1], place[2]);\n"
                + "                	var marker = new google.maps.Marker({\n"
                + "                		position: myLatLng,\n"
                + "                		map: map,\n"
                + "                		shape: shape,\n"
                + "                		title: place[3],\n"
                + "                		icon: \"http://alatheia.com/wp-content/uploads/workerComp.png\"\n"
                + "                	});\n"
                + "\n"
                + "                    // Push each workerComp marker to the corresponding array\n"
                + "                    workerCompMarkersArray.push(marker);\n"
                + "                    bindInfoWindow(marker, map, infoWindow, place[3]);\n"
                + "                }\n"
                + "            }"
                + "\n"
                + "function setCompletedWorkerCompMarkers(map, locations, infoWindow) {\n"
                + "		            	var shape = {\n"
                + "					coords: [17, 17, 34, 32],\n"
                + "					type: 'rect'\n"
                + "				};                // Create an empty array to hold your workerComp markers\n"
                + "                for (var i = 0; i < completedWorkerCompMarkers.length; i++) {\n"
                + "\n"
                + "                	var place = locations[i];\n"
                + "                	var myLatLng = new google.maps.LatLng(place[1], place[2]);\n"
                + "                	var marker = new google.maps.Marker({\n"
                + "                		position: myLatLng,\n"
                + "                		map: map,\n"
                + "                		shape: shape,\n"
                + "                		title: place[3],\n"
                + "                		icon: \"http://alatheia.com/wp-content/uploads/completedWorkerComp.png\"\n"
                + "                	});\n"
                + "\n"
                + "                    // Push each workerComp marker to the corresponding array\n"
                + "                    completedWorkerCompMarkersArray.push(marker);\n"
                + "                    bindInfoWindow(marker, map, infoWindow, place[3]);\n"
                + "                }\n"
                + "            }"
                + "             function setGoodProgressInquiryMarkers(map, locations, infoWindow) {\n"
                + "				var shape = {\n"
                + "					coords: [1, 1, 1, 20, 18, 20, 18 , 1],\n"
                + "					type: 'poly'\n"
                + "				};\n"
                + "		                // Create an empty array to hold your workerComp markers\n"
                + "		                for (var i = 0; i < goodProgressInquiryMarkers.length; i++) {\n"
                + "\n"
                + "		                	var place = locations[i];\n"
                + "		                	var myLatLng = new google.maps.LatLng(place[1], place[2]);\n"
                + "		                	var marker = new google.maps.Marker({\n"
                + "		                		position: myLatLng,\n"
                + "		                		map: map,\n"
                + "		                		shape: shape,\n"
                + "		                		title: place[0],\n"
                + "		                		icon: \"http://alatheia.com/wp-content/uploads/goodProgressInquiry.png\"\n"
                + "		                	});\n"
                + "\n"
                + "		                    // Push each workerComp marker to the corresponding array\n"
                + "		                    goodProgressInquiryMarkersArray.push(marker);\n"
                + "		                    bindInfoWindow(marker, map, infoWindow, place[3]);\n"
                + "		                }\n"
                + "		            }"
                + "\n"
                + "             function setBasicInquiryMarkers(map, locations, infoWindow) {\n"
                + "				var shape = {\n"
                + "					coords: [1, 1, 1, 20, 18, 20, 18 , 1],\n"
                + "					type: 'poly'\n"
                + "				};\n"
                + "		                // Create an empty array to hold your workerComp markers\n"
                + "		                for (var i = 0; i < basicInquiryMarkers.length; i++) {\n"
                + "\n"
                + "		                	var place = locations[i];\n"
                + "		                	var myLatLng = new google.maps.LatLng(place[1], place[2]);\n"
                + "		                	var marker = new google.maps.Marker({\n"
                + "		                		position: myLatLng,\n"
                + "		                		map: map,\n"
                + "		                		shape: shape,\n"
                + "		                		title: place[0],\n"
                + "		                		icon: \"http://alatheia.com/wp-content/uploads/basicInquiry.png\"\n"
                + "		                	});\n"
                + "\n"
                + "		                    // Push each basicInquiry marker to the corresponding array\n"
                + "		                    basicInquiryMarkersArray.push(marker);\n"
                + "		                    bindInfoWindow(marker, map, infoWindow, place[3]);\n"
                + "		                }\n"
                + "		            }"
                + "\n"
                + "             function setCompletedCustomerMarkers(map, locations, infoWindow) {\n"
                + "				var shape = {\n"
                + "					coords: [17, 17, 34, 32],\n"
                + "					type: 'rect'\n"
                + "				};"
                + "		                // Create an empty array to hold your workerComp markers\n"
                + "		                for (var i = 0; i < completedCustomerMarkers.length; i++) {\n"
                + "\n"
                + "		                	var place = locations[i];\n"
                + "		                	var myLatLng = new google.maps.LatLng(place[1], place[2]);\n"
                + "		                	var marker = new google.maps.Marker({\n"
                + "		                		position: myLatLng,\n"
                + "		                		map: map,\n"
                + "		                		shape: shape,\n"
                + "		                		title: place[0],\n"
                + "		                		icon: \"http://alatheia.com/wp-content/uploads/completedCustomer.png\"\n"
                + "		                	});\n"
                + "\n"
                + "		                    // Push each completedCustomer marker to the corresponding array\n"
                + "		                    completedCustomerMarkersArray.push(marker);\n"
                + "		                    bindInfoWindow(marker, map, infoWindow, place[3]);\n"
                + "		                }\n"
                + "		            }"
                + "\n"
                + "	         function setProsthetistMarkers(map, locations, infoWindow) {\n"
                + "					var shape = {\n"
                + "						coords: [1, 1, 1, 20, 18, 20, 18 , 1],\n"
                + "						type: 'poly'\n"
                + "					};\n"
                + "			                // Create an empty array to hold your workerComp markers\n"
                + "			                for (var i = 0; i < prosthetistMarkers.length; i++) {\n"
                + "\n"
                + "			                	var place = locations[i];\n"
                + "			                	var myLatLng = new google.maps.LatLng(place[1], place[2]);\n"
                + "			                	var marker = new google.maps.Marker({\n"
                + "			                		position: myLatLng,\n"
                + "			                		map: map,\n"
                + "			                		shape: shape,\n"
                + "			                		title: place[0],\n"
                + "			                		icon: \"http://alatheia.com/wp-content/uploads/prosthetist.png\"\n"
                + "			                	});\n"
                + "\n"
                + "			                    // Push each prosthetist marker to the corresponding array\n"
                + "			                    prosthetistMarkersArray.push(marker);\n"
                + "			                    bindInfoWindow(marker, map, infoWindow, place[3]);\n"
                + "			                }\n"
                + "			            }"
                + "	       function setTherapistMarkers(map, locations, infoWindow) {\n"
                + "					var shape = {\n"
                + "						coords: [1, 1, 1, 20, 18, 20, 18 , 1],\n"
                + "						type: 'poly'\n"
                + "					};\n"
                + "			                // Create an empty array to hold your workerComp markers\n"
                + "			                for (var i = 0; i < therapistMarkers.length; i++) {\n"
                + "\n"
                + "			                	var place = locations[i];\n"
                + "			                	var myLatLng = new google.maps.LatLng(place[1], place[2]);\n"
                + "			                	var marker = new google.maps.Marker({\n"
                + "			                		position: myLatLng,\n"
                + "			                		map: map,\n"
                + "			                		shape: shape,\n"
                + "			                		title: place[0],\n"
                + "			                		icon: \"http://alatheia.com/wp-content/uploads/therapist.png\"\n"
                + "			                	});\n"
                + "\n"
                + "			                    // Push each therapist marker to the corresponding array\n"
                + "			                    therapistMarkersArray.push(marker);\n"
                + "			                    bindInfoWindow(marker, map, infoWindow, place[3]);\n"
                + "			                }\n"
                + "			            }"
                + "\n"
                + "           function setPotentialMarkers(map, locations, infoWindow) {\n"
                + "				var shape = {\n"
                + "					coords: [17, 17, 34, 32],\n"
                + "					type: 'rect'\n"
                + "				};"
                + "		                // Create an empty array to hold your workerComp markers\n"
                + "		                for (var i = 0; i < potentialMarkers.length; i++) {\n"
                + "\n"
                + "		                	var place = locations[i];\n"
                + "		                	var myLatLng = new google.maps.LatLng(place[1], place[2]);\n"
                + "		                	var marker = new google.maps.Marker({\n"
                + "		                		position: myLatLng,\n"
                + "		                		map: map,\n"
                + "		                		shape: shape,\n"
                + "		                		title: place[0],\n"
                + "		                		icon: \"http://alatheia.com/wp-content/uploads/potential.png\"\n"
                + "		                	});\n"
                + "\n"
                + "		                    // Push each potential marker to the corresponding array\n"
                + "		                    potentialMarkersArray.push(marker);\n"
                + "		                    bindInfoWindow(marker, map, infoWindow, place[3]);\n"
                + "		                }\n"
                + "		            }"
                + "            function setNurseCaseManagerMarkers(map, locations, infoWindow) {\n"
                + "				var shape = {\n"
                + "					coords: [1, 1, 1, 20, 18, 20, 18 , 1],\n"
                + "                    type: 'poly'\n"
                + "				};		                // Create an empty array to hold your workerComp markers\n"
                + "		                for (var i = 0; i < nurseCaseManagerMarkers.length; i++) {\n"
                + "\n"
                + "		                	var place = locations[i];\n"
                + "		                	var myLatLng = new google.maps.LatLng(place[1], place[2]);\n"
                + "		                	var marker = new google.maps.Marker({\n"
                + "		                		position: myLatLng,\n"
                + "		                		map: map,\n"
                + "		                		shape: shape,\n"
                + "		                		title: place[0],\n"
                + "		                		icon: \"http://alatheia.com/wp-content/uploads/nurseCaseManager.png\"\n"
                + "		                	});\n"
                + "\n"
                + "		                    // Push each nurseCaseManager marker to the corresponding array\n"
                + "		                    nurseCaseManagerMarkersArray.push(marker);\n"
                + "		                    bindInfoWindow(marker, map, infoWindow, place[3]);\n"
                + "		                }\n"
                + "		            }"
                + "                     function completedWorkerCompMarkersSwitch(show){\n"
                + "		                // map.closeInfoWindow();\n"
                + "		                if (document.getElementById(show).checked==false) { // hide the marker\n"
                + "		                	for (var i=0; i<completedWorkerCompMarkersArray.length; i++) {\n"
                + "		                		completedWorkerCompMarkersArray[i].setVisible(false);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		                else { // show the marker again\n"
                + "		                	for (var i=0; i<completedWorkerCompMarkersArray.length; i++) {\n"
                + "		                		completedWorkerCompMarkersArray[i].setVisible(true);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		            }"
                + "		            function basicInquiryMarkersSwitch(show){\n"
                + "		                // map.closeInfoWindow();\n"
                + "		                if (document.getElementById(show).checked==false) { // hide the marker\n"
                + "		                	for (var i=0; i<basicInquiryMarkersArray.length; i++) {\n"
                + "		                		basicInquiryMarkersArray[i].setVisible(false);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		                else { // show the marker again\n"
                + "		                	for (var i=0; i<basicInquiryMarkersArray.length; i++) {\n"
                + "		                		basicInquiryMarkersArray[i].setVisible(true);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		            }\n"
                + "		            function goodProgressInquiryMarkersSwitch(show){\n"
                + "		                // map.closeInfoWindow();\n"
                + "		                if (document.getElementById(show).checked==false) { // hide the marker\n"
                + "		                	for (var i=0; i<goodProgressInquiryMarkersArray.length; i++) {\n"
                + "		                		goodProgressInquiryMarkersArray[i].setVisible(false);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		                else { // show the marker again\n"
                + "		                	for (var i=0; i<goodProgressInquiryMarkersArray.length; i++) {\n"
                + "		                		goodProgressInquiryMarkersArray[i].setVisible(true);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		            }\n"
                + "		            function potentialMarkersSwitch(show){\n"
                + "		                // map.closeInfoWindow();\n"
                + "		                if (document.getElementById(show).checked==false) { // hide the marker\n"
                + "		                	for (var i=0; i<potentialMarkersArray.length; i++) {\n"
                + "		                		potentialMarkersArray[i].setVisible(false);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		                else { // show the marker again\n"
                + "		                	for (var i=0; i<potentialMarkersArray.length; i++) {\n"
                + "		                		potentialMarkersArray[i].setVisible(true);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		            }\n"
                + "		            function completedCustomerMarkersSwitch(show){\n"
                + "		                // map.closeInfoWindow();\n"
                + "		                if (document.getElementById(show).checked==false) { // hide the marker\n"
                + "		                	for (var i=0; i<completedCustomerMarkersArray.length; i++) {\n"
                + "		                		completedCustomerMarkersArray[i].setVisible(false);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		                else { // show the marker again\n"
                + "		                	for (var i=0; i<completedCustomerMarkersArray.length; i++) {\n"
                + "		                		completedCustomerMarkersArray[i].setVisible(true);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		            }\n"
                + "		            function doctorMarkersSwitch(show){\n"
                + "		                // map.closeInfoWindow();\n"
                + "		                if (document.getElementById(show).checked==false) { // hide the marker\n"
                + "		                	for (var i=0; i<doctorMarkersArray.length; i++) {\n"
                + "		                		doctorMarkersArray[i].setVisible(false);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		                else { // show the marker again\n"
                + "		                	for (var i=0; i<doctorMarkersArray.length; i++) {\n"
                + "		                		doctorMarkersArray[i].setVisible(true);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		            }\n"
                + "		            function therapistMarkersSwitch(show){\n"
                + "		                // map.closeInfoWindow();\n"
                + "		                if (document.getElementById(show).checked==false) { // hide the marker\n"
                + "		                	for (var i=0; i<therapistMarkersArray.length; i++) {\n"
                + "		                		therapistMarkersArray[i].setVisible(false);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		                else { // show the marker again\n"
                + "		                	for (var i=0; i<therapistMarkersArray.length; i++) {\n"
                + "		                		therapistMarkersArray[i].setVisible(true);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		            }\n"
                + "		            function prosthetistMarkersSwitch(show){\n"
                + "		                // map.closeInfoWindow();\n"
                + "		                if (document.getElementById(show).checked==false) { // hide the marker\n"
                + "		                	for (var i=0; i<prosthetistMarkersArray.length; i++) {\n"
                + "		                		prosthetistMarkersArray[i].setVisible(false);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		                else { // show the marker again\n"
                + "		                	for (var i=0; i<prosthetistMarkersArray.length; i++) {\n"
                + "		                		prosthetistMarkersArray[i].setVisible(true);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		            }\n"
                + "		            function nurseCaseManagerMarkersSwitch(show){\n"
                + "		                // map.closeInfoWindow();\n"
                + "		                if (document.getElementById(show).checked==false) { // hide the marker\n"
                + "		                	for (var i=0; i<nurseCaseManagerMarkersArray.length; i++) {\n"
                + "		                		nurseCaseManagerMarkersArray[i].setVisible(false);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		                else { // show the marker again\n"
                + "		                	for (var i=0; i<nurseCaseManagerMarkersArray.length; i++) {\n"
                + "		                		nurseCaseManagerMarkersArray[i].setVisible(true);\n"
                + "		                	}\n"
                + "		                }\n"
                + "		            }\n"
                + "		            \n"
                + "\n"
                + "		            google.maps.event.addDomListener(window, 'load', initialize);\n"
                + "		        </script>\n"
                + "			<div id=\"map-canvas\"></div>\n"
                + "			<style type=\"text/css\">\n"
                + "				form    {\n"
                + "					background: -webkit-gradient(linear, bottom, left 175px, from(#CCCCCC), to(#EEEEEE));\n"
                + "					background: -moz-linear-gradient(bottom, #CCCCCC, #EEEEEE 175px);\n"
                + "					margin:auto;\n"
                + "					position:absolute;\n"
                + "					width: 98%;\n"
                + "					height:10.5%;\n"
                + "					font-family: Tahoma, Geneva, sans-serif;\n"
                + "					font-size: 14px;\n"
                + "					font-style: italic;\n"
                + "					line-height: 24px;\n"
                + "					font-weight: bold;\n"
                + "					color: #09C;\n"
                + "					text-decoration: none;\n"
                + "					-webkit-border-radius: 10px;\n"
                + "					-moz-border-radius: 10px;\n"
                + "					border-radius: 10px;\n"
                + "					padding:10px;\n"
                + "					border: 1px solid #999;\n"
                + "					border: inset 1px solid #333;\n"
                + "					-webkit-box-shadow: 0px 0px 8px rgba(0, 0, 0, 0.3);\n"
                + "					-moz-box-shadow: 0px 0px 8px rgba(0, 0, 0, 0.3);\n"
                + "					box-shadow: 0px 0px 8px rgba(0, 0, 0, 0.3);\n"
                + "				}\n"
                + "                             p{\n"
                + "					font-size: 175%;\n"
                + "				}"
                + "				ca{\n"
                + "					text-align: center;\n"
                + "				}\n"
                + "				html, body, #map-canvas { height: 95%; width: 100%; margin: 0; padding: 0;}\n"
                + "			</style>\n"
                + "		    </head>\n"
                + "		    <body>\n"
                + "		    	<div>\n"
                + "		    		<form name=\"Leads\" action=\"\"><strong>Leads &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;Contacts</strong><br />\n"
                + "		    			<img src=\"http://alatheia.com/wp-content/uploads/basicInquiry.png\" width=\"17\" height=\"25\" title=\"Basic Inquiries\" alt=\"Red Marker\" /> \n"
                + "		    			<input type=\"checkbox\" name=\"red\" id=\"red\" onclick=\"basicInquiryMarkersSwitch('red')\" checked=\"checked\" /> Basic Inquiries\n"
                + "		    			<img src=\"http://alatheia.com/wp-content/uploads/goodProgressInquiry.png\" width=\"17\" height=\"25\" title=\"Good Progress Inquiries\" alt=\"Good Progress Inquiries\" /> \n"
                + "		    			<input type=\"checkbox\" name=\"Good Progress Inquiries\" id=\"Good Progress Inquiries\" onclick=\"goodProgressInquiryMarkersSwitch('Good Progress Inquiries')\" checked=\"checked\" /> Good Progress Inquiries\n"
                + "		    			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n"
                + "\n"
                + "		    			<img src=\"http://alatheia.com/wp-content/uploads/potential.png\" width=\"20\" height=\"25\" title=\"Potential\" alt=\"Red Marker\" /> \n"
                + "		    			<input type=\"checkbox\" name=\"potential\" id=\"potential\" onclick=\"potentialMarkersSwitch('potential')\" checked=\"checked\" /> Potential Clients\n"
                + "		    			\n"
                + "		    			<img src=\"http://alatheia.com/wp-content/uploads/completedCustomer.png\" width=\"20\" height=\"25\" title=\"Completed Customer\" alt=\"Red Marker\" /> \n"
                + "		    			<input type=\"checkbox\" name=\"completed\" id=\"completed\" onclick=\"completedCustomerMarkersSwitch('completed')\" checked=\"checked\" /> Completed Customers\n"
                + "\n"
                + "					<img src=\"http://alatheia.com/wp-content/uploads/prosthetist.png\" width=\"17\" height=\"25\" title=\"Completed Customer\" alt=\"Red Marker\" /> \n"
                + "		    			<input type=\"checkbox\" name=\"prosthetist\" id=\"prosthetist\" onclick=\"prosthetistMarkersSwitch('prosthetist')\" checked=\"checked\" /> Prosthetists <br/>\n"
                + "		    			\n"
                + "					<img src=\"http://alatheia.com/wp-content/uploads/workerComp.png\" width=\"20\" height=\"25\" title=\"Worker Comp Markers\" alt=\"Yellow Marker\" /> \n"
                + "			    		<input type=\"checkbox\" name=\"worker comp\" id=\"worker comp\" onclick=\"workerCompMarkersSwitch('worker comp')\" checked=\"checked\" /> Worker Comps\n"
                + "		    			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n"
                + "		    			<img src=\"http://alatheia.com/wp-content/uploads/doctor.png\" width=\"17\" height=\"25\" title=\"doctor\" alt=\"Red Marker\" /> \n"
                + "		    			<input type=\"checkbox\" name=\"doctor\" id=\"doctor\" onclick=\"doctorMarkersSwitch('doctor')\" checked=\"checked\" /> Doctors\n"
                + "\n"
                + "		    			<img src=\"http://alatheia.com/wp-content/uploads/therapist.png\" width=\"17\" height=\"25\" title=\"therapist\" alt=\"Red Marker\" /> \n"
                + "		    			<input type=\"checkbox\" name=\"therapist\" id=\"therapist\" onclick=\"therapistMarkersSwitch('therapist')\" checked=\"checked\" /> Therapists\n"
                + "\n"
                + "		    			<img src=\"http://alatheia.com/wp-content/uploads/nurseCaseManager.png\" width=\"17\" height=\"25\" title=\"nurseCaseManager\" alt=\"Red Marker\" /> \n"
                + "		    			<input type=\"checkbox\" name=\"nurseCaseManager\" id=\"nurseCaseManager\" onclick=\"nurseCaseManagerMarkersSwitch('nurseCaseManager')\" checked=\"checked\" /> Nurse Case Managers\n"
                + "\n"
                + "                                     <img src=\"http://alatheia.com/wp-content/uploads/completedWorkerComp.png\" width=\"20\" height=\"25\" title=\"completedWorkerComp\" alt=\"Red Marker\" /> \n"
                + "		    			<input type=\"checkbox\" name=\"completedWorkerComp\" id=\"completedWorkerComp\" onclick=\"completedWorkerCompMarkersSwitch('completedWorkerComp')\" checked=\"checked\" /> Completed Worker Comps<br />\n"
                + "\n"
                + "		    			\n"
                + "		    			\n"
                + "		    			\n"
                + "		    		</form> \n"
                + "		    	</div>\n"
                + "		    </body>\n"
                + "		    </html>";
    }
}
