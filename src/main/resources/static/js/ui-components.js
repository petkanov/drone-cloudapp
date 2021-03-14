const renderMapPointDataComponent = function (pointId, alt, speed) {
    return '<form id="' + pointId + '">' +
        '<input type="text" name="height" value="' + alt + '"/> Height' + '<br />' +
        '<input type="text" name="speed" value="' + speed + '" /> Speed' + '<br />' +
        '<input type="hidden" name="key" value="' + pointId + '"/>' +
        '<select name="action"><option value="0">No Action</option><option value="1">Activate</option></select>' + '<br />' +
        '<input type="submit" value="Save" onClick="updatePointValue(this.form); return false;" />' +
        '<input type="button" value="Remove" onClick="removePoint(this.form); return false;" />' + '<br />' +
        '</form>'
}


const renderDroneUIComponent = function (droneDTO) {
    return '<div id="ctrlPanel1'+droneDTO.id+'" droneId="'+droneDTO.id+'" class="dronesList-header">Drone: '+droneDTO.id +

        ' -> <label>Altitude (m): </label> <input type="text" id="infoAlt'+droneDTO.id+'" size="2" value="'+droneDTO.alt+'" disabled />' +
        '<label> Speed (km/h): </label> <input type="text" id="infoSpeed'+droneDTO.id+'" size="2" value="'+droneDTO.speed+'" disabled />' +
        '<label> Voltage: </label> <input type="text" id="infoBat'+droneDTO.id+'" size="2" value="'+droneDTO.battery+'" disabled />' +

        '<p id="onlineStatus'+droneDTO.id+'" class="drone-status">ONLINE</p>' +
        '<p id="armedStatus'+droneDTO.id+'" class="drone-arm-status">'+droneDTO.state+'</p>  </div>' +

        '<div class="dronesList-content" style="position:relative;">' +

        '<img id="video'+droneDTO.id+'"  src="video.jpg"  style="width: 100%;" ' +
             'onclick="DRONES_MAP.get(\''+droneDTO.id+'\').startVideoFeed(); activateViewFPV(\''+droneDTO.id+'\');"> <br/>' +

        '<div id="ctrlPanel2'+droneDTO.id+'" style="position: absolute; top: 56%; float: left;">' +
        '<table><tr><td> </td>' +
        '<td> <input class="button" id="btnF'+droneDTO.id+'" type="button" value="FORWARD" /></td>' +
        '<td> </td> </tr>' +
        '<tr> <td><input class="button" id="btnMvL'+droneDTO.id+'" type="button" value=" LEFT " /> </td>' +
        '<td> <input class="button" id="btnCncl'+droneDTO.id+'" type="button" value=" STOP " /></td>' +
        '<td> <input class="button" id="btnMvR'+droneDTO.id+'" type="button" value=" RIGHT " /> </td></tr>' +
        '<tr> <td> </td>' +
        '<td><input class="button" id="btnB'+droneDTO.id+'" type="button" value="BACKWARD" /></td>' +
        '<td> </td></tr></table>  </div>' +

        '<div id="ctrlPanel3'+droneDTO.id+'" style="position: absolute; top: 35%;left:50px;">' +
        '<table><tr> <td> <input class="button" id="mStart'+droneDTO.id+'" type="button" value="START/PAUSE Mission" /> </td></tr> ' +
        '<tr> <td> <input class="button" id="mCancel'+droneDTO.id+'" type="button" value="CLEAR Mission Data" /> </td></tr>' +
        '</table></div>' +

        '<div id="ctrlPanel8'+droneDTO.id+'" style="position: absolute; top: 35%;right:50px;">' +
        '<table><tr> <td> <input class="button" id="cameraUP'+droneDTO.id+'" type="button" value=" UP " /> </td></tr> ' +
        '<tr> <td> <input class="button" id="cameraDOWN'+droneDTO.id+'" type="button" value="DOWN" /> </td></tr>' +
        '</table>  </div>' +

        '<div id="ctrlPanel4'+droneDTO.id+'" style="position: absolute; top: 56%;right:30px;">' +
        '<table><tr> <td> <input class="button" id="btnRLEFT45' + droneDTO.id + '" type="button" value="LEFT45" /> </td>' +
        '<td> <input class="button" id="btnU'+droneDTO.id+'" type="button" value="ASCEND" /> </td> ' +
        '<td> <input class="button" id="btnRRIGHT45'+droneDTO.id+'" type="button" value="RIGHT45" /></td></tr>' +
        '<tr> <td> <input class="button" id="btnRL'+droneDTO.id+'" type="button" value="ROTATE-L" /></td>' +
        '<td> <input class="button" id="btnStopZ'+droneDTO.id+'" type="button" value="STOP" /></td> ' +
        '<td> <input class="button" id="btnRR'+droneDTO.id+'" type="button" value="ROTATE-R" /></td> </tr>' +
        '<tr> <td> <input class="button" id="btnRLEFT90'+droneDTO.id+'" type="button" value="LEFT90" /> </td>' +
        '<td> <input class="button" id="btnD'+droneDTO.id+'" type="button" value="DESCEND" /> </td> ' +
        '<td> <input class="button" id="btnRRIGHT90'+droneDTO.id+'" type="button" value="RIGHT90" /> </td></tr>' +
        '</table>  </div>' +

        '<div id="ctrlPanel5'+droneDTO.id+'" style="position:relative;top:-50px;">' +
        '<input class="button" id="fArm'+droneDTO.id+'" type="button" value="TAKEOFF" style="width:16%;float:left;" />' +
        '<input class="button" id="fDisarm'+droneDTO.id +'" type="button" value="LAND"  style="width:16%;float:left;margin-left:15px;"/>' +
        '<input class="button" id="mRTL'+droneDTO.id+'" type="button" value="RETURN HOME"  style="width:16%;float:left;margin-left:15px;" />' +
        '<input class="button" id="fActivate'+droneDTO.id+'" type="button" style="width:16%;margin-left:65px;float:left;" value="DROP PACKAGE"/>' +
        '<input class="button" onclick="copyToClipboard(\'copyLink'+droneDTO.id+'\')" type="button" style="width:16%;float:right;" value="SHARE Video Feed"/>' +
        '<input type="text" size="55" style="position:absolute;top:45px;" id="copyLink'+droneDTO.id+'" value="http://'+PUBLIC_IP+'/v/'+droneDTO.id+'" />' +
        '</div>' +

        '<div id="ctrlPanel6'+droneDTO.id+'" style="position:absolute;top:30px;left:30px;">' +
        '<input class="button" onclick="activateViewMAP(\''+droneDTO.id+'\')" type="button" value="VIEW ON MAP" style="width:148px;background-color:green;opacity:0.55;"/>' +
        '</div>' +

        '<div id="ctrlPanel7'+droneDTO.id+'" style="position: absolute; top: 30px;right:30px;">' +
        '<input class="button" id="fKill'+droneDTO.id+'" type="button" value="KILL MOTORS" style="width:133px;background-color:#ff0000;opacity:0.55;"/>' +
        '</div>' +

        '</div>'
}



const activateViewFPV = function (id) {
	$('#map').hide();

	$('.dronesList').css({ "width": "100%" });
	$('#ctrlPanel2'+id).css({ "position": "absolute", "top": "56%", "float": "left", "margin-top": "", "left": "",      "width": "" });
	$('#ctrlPanel3'+id).css({ "position": "absolute", "top": "35%", "float": "",     "margin-top": "", "left": "50px",  "width": "" });
	$('#ctrlPanel4'+id).css({ "position": "absolute", "top": "56%", "right": "30px", "margin-top": "", "float": "", "left": "", "width": "" });

    $('div[id^="ctrlPanel1"]').show();
    
	$('#ctrlPanel6'+id).show();
	$('#ctrlPanel5'+id).show();
	$('#ctrlPanel7'+id).show();
}



const activateViewMAP = function (id) { 
	$('#map').show();
	$('#map').css({ "width": "65%", "height": "950px", "position": "relative", "float": "left", "top": "0px", "left": "0px", "opacity": "1" });

    $('div[id^="ctrlPanel1"]').hide();
	$('#ctrlPanel5'+id).hide();
	$('#ctrlPanel6'+id).hide();
	$('#ctrlPanel7'+id).hide();


	$('#ctrlPanel2'+id).css({ "position": "relative", "float": "left", "margin-top": "25px", "left": "-25px", "width": "100%", "right": "", "top": "" });
	$('#ctrlPanel3'+id).css({ "position": "relative", "float": "left", "margin-top": "25px", "left": "-25px", "width": "100%", "right": "", "top": "" });
	$('#ctrlPanel4'+id).css({ "position": "relative", "float": "left", "margin-top": "25px", "left": "-25px", "width": "100%", "right": "", "top": "" });

	$('.dronesList').css({ "width": "35%" });
}