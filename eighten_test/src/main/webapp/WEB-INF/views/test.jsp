<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8"/>
	<title>Kakao 지도 시작하기</title>
	
</head>
<body>
	<h1>지도</h1>
	<div id="map" style="width:500px;height:400px;"></div>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=894ff21b92a20e1db061ff8f8fc2594d&libraries=services"></script>
	<script>		
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
	    mapOption = {
	        center: new kakao.maps.LatLng(37.511125,127.035685), // 지도의 중심좌표
	        level: 3 // 지도의 확대 레벨
	    };  
		var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
		
		var geocoder = new kakao.maps.services.Geocoder();
		
		geocoder.addressSearch('서울 강남구 언주로 617', function(result, status){

			// 정상적 검색이 완료되었으면
			if ( status === kakao.maps.services.Status.OK){
				var coords = new kakao.maps.LatLng(result[0].y,result[0].x);

				// 결과값으로 받은 위치를 마커로 표시합니다
		        var marker = new kakao.maps.Marker({
		            map: map,
		            position: coords
		        });
				
				var masseage = '경도 : ' + coords.getLat() + "/ 위도 : " + coords.getLng();
		
		        // 인포윈도우로 장소에 대한 설명을 표시합니다
		        var infowindow = new kakao.maps.InfoWindow({
		            content: '<div class="wrap">' + 
		            '    <div class="info" style="padding:5px">' + 
		            '        <div class="title">' + 
		            '            Xiilab 씨이랩' + 
		            '        </div>' + 
		            '        <div class="body">' + 
		            '        	aighten@aighten.com' + 
		            '        </div>' + 
		            '    </div>' +    
		            '</div>'
		        });
		        infowindow.open(map, marker);
		
		        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
		        map.setCenter(coords);
			}
		});
		
	</script>
</body>
</html>