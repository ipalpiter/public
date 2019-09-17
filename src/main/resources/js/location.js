
var provinceList = [
    {name:'北京', schoolList:[
            '北京大学','清华大学']
    },
    {name:'河北', schoolList:[
            '燕山大学','河北大学']
    }
];
var provinceArray = new Array();
var schoolArray = new Array();
var provinceTag = document.getElementById("province");
var schoolTag = document.getElementById("school");
var schoolList;
var provinceArray = new Array();
var schoolArray = new Array();

function getProvince(){
    var provinceTag = document.getElementById("province");
    for(var i=0;i<provinceList.length;i++){
        var provincename=provinceList[i].name;
        provinceArray[i]=provincename;
        provinceTag.add(new Option(provincename,provincename));
    }
}

function chooseProvince(th){
    var schoolTag=document.getElementById("school");
    var index=th.selectedIndex-1;
    var provinceName =provinceArray[index];
    schoolTag.innerHTML="";
    for(var i=0;i<provinceList.length;i++){
        var province=provinceList[i];
        if(province.name==provinceName){
            schoolList=province.schoolList;
            for(var n=0;n<schoolList.length;n++){
                var schoolName=schoolList[n];
                schoolTag.add(new Option(schoolName,schoolName));
            }
        }
    }
}

