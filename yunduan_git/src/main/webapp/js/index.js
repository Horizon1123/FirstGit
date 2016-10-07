$(function() {
		$("#listFavorites").panel({
			fit : true,
			title : " ",
			border : false,
		});
		
		$("#addFav").dialog({
			height:260, 
			width:380,
			title:'',
			border:false,
			modal:true
		});
		
		$("#addFav").dialog("close", true);
		
		$("#labels_table td").hover(selectLabel);
		
		loadInfoTag();
		
	});
	
	function add(){
		$("#addFav").dialog("open", true);
	}
	
	function addWinClose(){
		$("#addFav").dialog("close", true);
		return false;
	}
	
	function selectLabel() {
		$("#labels_table td").removeClass("selected_label");
		$(this).addClass("selected_label");	}
	
	function loadInfoTag(){
		$.post("tag/findAll",function(data){
			alert(data);
			var tagStr="";
			for(var i=0;i<data.length;i++){
				tagStr+='<tr><td><a href="#?type='+data[i].t_name+'">'+data[i].t_name+'('+data[i].t_count+')'+'</a></td></tr>';
			}
			$("#labelContent")[0].innerHTML=tagStr;
			$("#labels_table td").hover(selectLabel);
		},"json");
	}
	
	function addFavorite(){
		var str=$("#addFavForm").serialize();
		alert(str);
		$.post("favorite/add",str,function(data){
			if(data){
				addWinClose();//关闭书签窗口
				
				//添加书签结果信息
				$.messager.show({
					title:'添加书签信息',
					msg:'添加书签' + (data ? "成功...." : " 失败!!!" ),
					showType:'show',
					style:{
						top:document.body.scrollTop+document.documentElement.scrollTop,
					}
				});
				loadInfoTag();
			}
		},"json");
		return false;
	}
	
	function toJsonStr(str){
		return str="{\"" + str.replace(/=/g,"\":\"").replace(/&/g,"\",\"")+"\"}";
	}