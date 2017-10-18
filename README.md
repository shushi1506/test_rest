//Max level sidekick
//eqit fiona
// pause   var i = this._cachedKeys[t]
var _r1 = new RegExp("Item:sidekick:.*");
 
for (var i = 0; i < e.instances.length; i++) {
    if (_r1.test(e.instances[i].modelID)) {
        e.instances[i].stats.maturity = 3;
        e.instances[i].stats.xp = 125800;
        e.instances[i].stats.zodiac = 2;
        e.instances[i].stats.zodiacBonus = 2;
    }
}
 
 
//InstanceCache.prototype.writeDirtyInstancesToState

GET ANY SIDEKICK SCRIPT
var _r1 = new RegExp("_maturity");
var _r2 = new RegExp("_zodiac_bonus");
var _r3 = new RegExp("_xp");
var _r5 = new RegExp("Item");
var _r4 = new RegExp("NC04"); //sidekick you want to change
for(var i in e){
    if(_r4.test(e[i].schemaPrimativeID)){
        if (_r5.test(e[i].schemaPrimativeType)) {
            e[i].schemaPrimativeID="sidekick:WC08"; //to sidekick you want
        }
        if (_r1.test(e[i].schemaPrimativeID)) {
            e[i].maximum=3;
            e[i].value=3;
        }
        if (_r2.test(e[i].schemaPrimativeID)) {
            e[i].maximum=2;
            e[i].value=2;
        }
        if (_r3.test(e[i].schemaPrimativeID)) {
            e[i].maximum=200000;
            e[i].value=200000;
        }
    }
}

search : Query.porotype.run
//Break point
InstanceCache.prototype.writeDirtyInstancesToState
 
//all sidekicks
var count = e.instances.length - 189; // x = 63 - 126 - 189
//Stage 1
e.instances[count++].modelID = "Item:sidekick:FC00"; //start of FC
e.instances[count++].modelID = "Item:sidekick:FC01";
e.instances[count++].modelID = "Item:sidekick:FC02";
e.instances[count++].modelID = "Item:sidekick:FC04";
e.instances[count++].modelID = "Item:sidekick:FC05";
e.instances[count++].modelID = "Item:sidekick:FC06";
e.instances[count++].modelID = "Item:sidekick:FC07";
e.instances[count++].modelID = "Item:sidekick:FC08";
e.instances[count++].modelID = "Item:sidekick:FC09";
e.instances[count++].modelID = "Item:sidekick:FC10";
e.instances[count++].modelID = "Item:sidekick:FC11";
e.instances[count++].modelID = "Item:sidekick:FC12";
e.instances[count++].modelID = "Item:sidekick:FC13";
e.instances[count++].modelID = "Item:sidekick:FC22";
e.instances[count++].modelID = "Item:sidekick:FC23";
e.instances[count++].modelID = "Item:sidekick:LC00"; //start of LC
e.instances[count++].modelID = "Item:sidekick:LC01";
e.instances[count++].modelID = "Item:sidekick:LC03";
e.instances[count++].modelID = "Item:sidekick:LC05";
e.instances[count++].modelID = "Item:sidekick:LC06";
e.instances[count++].modelID = "Item:sidekick:LC08";
e.instances[count++].modelID = "Item:sidekick:LC09";
e.instances[count++].modelID = "Item:sidekick:LC10";
e.instances[count++].modelID = "Item:sidekick:LC22";
e.instances[count++].modelID = "Item:sidekick:LC23";
e.instances[count++].modelID = "Item:sidekick:NC00"; //start of NC
e.instances[count++].modelID = "Item:sidekick:NC01";
e.instances[count++].modelID = "Item:sidekick:NC02";
e.instances[count++].modelID = "Item:sidekick:NC03";
e.instances[count++].modelID = "Item:sidekick:NC04";
e.instances[count++].modelID = "Item:sidekick:NC05";
e.instances[count++].modelID = "Item:sidekick:NC07";
e.instances[count++].modelID = "Item:sidekick:NC08";
e.instances[count++].modelID = "Item:sidekick:NC09";
e.instances[count++].modelID = "Item:sidekick:NC10";
e.instances[count++].modelID = "Item:sidekick:NC22";
e.instances[count++].modelID = "Item:sidekick:NC23";
e.instances[count++].modelID = "Item:sidekick:SC00"; //start of SC
e.instances[count++].modelID = "Item:sidekick:SC01";
e.instances[count++].modelID = "Item:sidekick:SC02";
e.instances[count++].modelID = "Item:sidekick:SC03";
e.instances[count++].modelID = "Item:sidekick:SC04";
e.instances[count++].modelID = "Item:sidekick:SC05";
e.instances[count++].modelID = "Item:sidekick:SC06";
e.instances[count++].modelID = "Item:sidekick:SC08";
e.instances[count++].modelID = "Item:sidekick:SC09";
e.instances[count++].modelID = "Item:sidekick:SC10";
e.instances[count++].modelID = "Item:sidekick:SC11";
e.instances[count++].modelID = "Item:sidekick:SC22";
e.instances[count++].modelID = "Item:sidekick:SC23";
e.instances[count++].modelID = "Item:sidekick:WC00"; //start of WC
e.instances[count++].modelID = "Item:sidekick:WC01";
e.instances[count++].modelID = "Item:sidekick:WC02";
e.instances[count++].modelID = "Item:sidekick:WC04";
e.instances[count++].modelID = "Item:sidekick:WC05";
e.instances[count++].modelID = "Item:sidekick:WC06";
e.instances[count++].modelID = "Item:sidekick:WC08";
e.instances[count++].modelID = "Item:sidekick:WC11";
e.instances[count++].modelID = "Item:sidekick:WC13";
e.instances[count++].modelID = "Item:sidekick:WC14";
e.instances[count++].modelID = "Item:sidekick:WC22";
e.instances[count++].modelID = "Item:sidekick:WC23";
e.instances[count++].modelID = "Item:sidekick:PC22"; //start of PC
//stage 2
e.instances[count++].modelID = "Item:sidekick:FC00"; //start of FC
e.instances[count++].modelID = "Item:sidekick:FC01";
e.instances[count++].modelID = "Item:sidekick:FC02";
e.instances[count++].modelID = "Item:sidekick:FC04";
e.instances[count++].modelID = "Item:sidekick:FC05";
e.instances[count++].modelID = "Item:sidekick:FC06";
e.instances[count++].modelID = "Item:sidekick:FC07";
e.instances[count++].modelID = "Item:sidekick:FC08";
e.instances[count++].modelID = "Item:sidekick:FC09";
e.instances[count++].modelID = "Item:sidekick:FC10";
e.instances[count++].modelID = "Item:sidekick:FC11";
e.instances[count++].modelID = "Item:sidekick:FC12";
e.instances[count++].modelID = "Item:sidekick:FC13";
e.instances[count++].modelID = "Item:sidekick:FC22";
e.instances[count++].modelID = "Item:sidekick:FC23";
e.instances[count++].modelID = "Item:sidekick:LC00"; //start of LC
e.instances[count++].modelID = "Item:sidekick:LC01";
e.instances[count++].modelID = "Item:sidekick:LC03";
e.instances[count++].modelID = "Item:sidekick:LC05";
e.instances[count++].modelID = "Item:sidekick:LC06";
e.instances[count++].modelID = "Item:sidekick:LC08";
e.instances[count++].modelID = "Item:sidekick:LC09";
e.instances[count++].modelID = "Item:sidekick:LC10";
e.instances[count++].modelID = "Item:sidekick:LC22";
e.instances[count++].modelID = "Item:sidekick:LC23";
e.instances[count++].modelID = "Item:sidekick:NC00"; //start of NC
e.instances[count++].modelID = "Item:sidekick:NC01";
e.instances[count++].modelID = "Item:sidekick:NC02";
e.instances[count++].modelID = "Item:sidekick:NC03";
e.instances[count++].modelID = "Item:sidekick:NC04";
e.instances[count++].modelID = "Item:sidekick:NC05";
e.instances[count++].modelID = "Item:sidekick:NC07";
e.instances[count++].modelID = "Item:sidekick:NC08";
e.instances[count++].modelID = "Item:sidekick:NC09";
e.instances[count++].modelID = "Item:sidekick:NC10";
e.instances[count++].modelID = "Item:sidekick:NC22";
e.instances[count++].modelID = "Item:sidekick:NC23";
e.instances[count++].modelID = "Item:sidekick:SC00"; //start of SC
e.instances[count++].modelID = "Item:sidekick:SC01";
e.instances[count++].modelID = "Item:sidekick:SC02";
e.instances[count++].modelID = "Item:sidekick:SC03";
e.instances[count++].modelID = "Item:sidekick:SC04";
e.instances[count++].modelID = "Item:sidekick:SC05";
e.instances[count++].modelID = "Item:sidekick:SC06";
e.instances[count++].modelID = "Item:sidekick:SC08";
e.instances[count++].modelID = "Item:sidekick:SC09";
e.instances[count++].modelID = "Item:sidekick:SC10";
e.instances[count++].modelID = "Item:sidekick:SC11";
e.instances[count++].modelID = "Item:sidekick:SC22";
e.instances[count++].modelID = "Item:sidekick:SC23";
e.instances[count++].modelID = "Item:sidekick:WC00"; //start of WC
e.instances[count++].modelID = "Item:sidekick:WC01";
e.instances[count++].modelID = "Item:sidekick:WC02";
e.instances[count++].modelID = "Item:sidekick:WC04";
e.instances[count++].modelID = "Item:sidekick:WC05";
e.instances[count++].modelID = "Item:sidekick:WC06";
e.instances[count++].modelID = "Item:sidekick:WC08";
e.instances[count++].modelID = "Item:sidekick:WC11";
e.instances[count++].modelID = "Item:sidekick:WC13";
e.instances[count++].modelID = "Item:sidekick:WC14";
e.instances[count++].modelID = "Item:sidekick:WC22";
e.instances[count++].modelID = "Item:sidekick:WC23";
e.instances[count++].modelID = "Item:sidekick:PC22"; //start of PC
//stage 3
e.instances[count++].modelID = "Item:sidekick:FC00"; //start of FC
e.instances[count++].modelID = "Item:sidekick:FC01";
e.instances[count++].modelID = "Item:sidekick:FC02";
e.instances[count++].modelID = "Item:sidekick:FC04";
e.instances[count++].modelID = "Item:sidekick:FC05";
e.instances[count++].modelID = "Item:sidekick:FC06";
e.instances[count++].modelID = "Item:sidekick:FC07";
e.instances[count++].modelID = "Item:sidekick:FC08";
e.instances[count++].modelID = "Item:sidekick:FC09";
e.instances[count++].modelID = "Item:sidekick:FC10";
e.instances[count++].modelID = "Item:sidekick:FC11";
e.instances[count++].modelID = "Item:sidekick:FC12";
e.instances[count++].modelID = "Item:sidekick:FC13";
e.instances[count++].modelID = "Item:sidekick:FC22";
e.instances[count++].modelID = "Item:sidekick:FC23";
e.instances[count++].modelID = "Item:sidekick:LC00"; //start of LC
e.instances[count++].modelID = "Item:sidekick:LC01";
e.instances[count++].modelID = "Item:sidekick:LC03";
e.instances[count++].modelID = "Item:sidekick:LC05";
e.instances[count++].modelID = "Item:sidekick:LC06";
e.instances[count++].modelID = "Item:sidekick:LC08";
e.instances[count++].modelID = "Item:sidekick:LC09";
e.instances[count++].modelID = "Item:sidekick:LC10";
e.instances[count++].modelID = "Item:sidekick:LC22";
e.instances[count++].modelID = "Item:sidekick:LC23";
e.instances[count++].modelID = "Item:sidekick:NC00"; //start of NC
e.instances[count++].modelID = "Item:sidekick:NC01";
e.instances[count++].modelID = "Item:sidekick:NC02";
e.instances[count++].modelID = "Item:sidekick:NC03";
e.instances[count++].modelID = "Item:sidekick:NC04";
e.instances[count++].modelID = "Item:sidekick:NC05";
e.instances[count++].modelID = "Item:sidekick:NC07";
e.instances[count++].modelID = "Item:sidekick:NC08";
e.instances[count++].modelID = "Item:sidekick:NC09";
e.instances[count++].modelID = "Item:sidekick:NC10";
e.instances[count++].modelID = "Item:sidekick:NC22";
e.instances[count++].modelID = "Item:sidekick:NC23";
e.instances[count++].modelID = "Item:sidekick:SC00"; //start of SC
e.instances[count++].modelID = "Item:sidekick:SC01";
e.instances[count++].modelID = "Item:sidekick:SC02";
e.instances[count++].modelID = "Item:sidekick:SC03";
e.instances[count++].modelID = "Item:sidekick:SC04";
e.instances[count++].modelID = "Item:sidekick:SC05";
e.instances[count++].modelID = "Item:sidekick:SC06";
e.instances[count++].modelID = "Item:sidekick:SC08";
e.instances[count++].modelID = "Item:sidekick:SC09";
e.instances[count++].modelID = "Item:sidekick:SC10";
e.instances[count++].modelID = "Item:sidekick:SC11";
e.instances[count++].modelID = "Item:sidekick:SC22";
e.instances[count++].modelID = "Item:sidekick:SC23";
e.instances[count++].modelID = "Item:sidekick:WC00"; //start of WC
e.instances[count++].modelID = "Item:sidekick:WC01";
e.instances[count++].modelID = "Item:sidekick:WC02";
e.instances[count++].modelID = "Item:sidekick:WC04";
e.instances[count++].modelID = "Item:sidekick:WC05";
e.instances[count++].modelID = "Item:sidekick:WC06";
e.instances[count++].modelID = "Item:sidekick:WC08";
e.instances[count++].modelID = "Item:sidekick:WC11";
e.instances[count++].modelID = "Item:sidekick:WC13";
e.instances[count++].modelID = "Item:sidekick:WC14";
e.instances[count++].modelID = "Item:sidekick:WC22";
e.instances[count++].modelID = "Item:sidekick:WC23";
e.instances[count++].modelID = "Item:sidekick:PC22"; //start of PC
//63 lines of sidekick's above per section ^
 
//setting level of the Sidekicks
 
for (var i = e.instances.length - 189; i < e.instances.length; i++) {
    e.instances[i].stats.xp = 125800;
    e.instances[i].stats.maturity = 3;
    e.instances[i].stats.zodiacBonus = 2;
}
for (var i = e.instances.length - 126; i < e.instances.length; i++) {
    e.instances[i].stats.xp = 62800;
    e.instances[i].stats.maturity = 2;
    e.instances[i].stats.zodiacBonus = 2;
}
for (var i = e.instances.length - 63; i < e.instances.length; i++) {
    e.instances[i].stats.xp = 21400;
    e.instances[i].stats.maturity = 1;
    e.instances[i].stats.zodiacBonus = 2;
}
 
//buying 100 at once
 
//point
GachaCellView.prototype.onCellClicked
//script
var r = 87;
for (var c = 0; c < r; c++) {
  GC.app.mvc.sendNotification("PlayGachaCommand", { type: "legendary", isFree: true});
}

.	BẮN CHO ĐỦ 1000 TIỀN VÀNG ĐỂ MUA NHÂN VẬT FIONA. Để nguyên màn hình ở chỗ nhân vật FIONA này
2.	MUA XONG, CHUỘT PHẢI -> CHỌN INSPECT
3.	CHỌN TAB CONSOLE
4.	Kéo lên xuống tìm file VMxxx:xxx (xxx là số), bấm vào
5.	Click vào nút Pretty Print {} ở dưới cùng bên trái khung soạn thảo
6.	Click chuột vào bên trong khung soạn thảo. Sau đó bấm tổ hợp phím Ctrl+F để bật ra khung tìm kiếm
7.	Dán dòng sau vào:

InstanceCache.prototype.writeDirtyInstancesToState

8.	Click vào hàng số thứ tự ở bên trái dòng nào có dạng như sau: 

var i = this._cachedKeys[t]

9.	Bên khung hiển thị trò chơi, bấm EQUIP, lúc này, bên khung soạn thảo code, dòng var i = this._cachedKeys[t] sẽ sáng lên
10.	Bấm vào tab CONSOLE
11.	Sao chép và dán lệnh sau vào rồi ENTER:

//Unlock all champions
var _r1= new RegExp("Item:.");
 
for(var i = 0; i < e.instances.length; i++) {
    if(_r1.test(e.instances[i].modelID)) {
        e.instances[i].state = "idle";
    }
	}

//MAX COINS
var _r1 = new RegExp("Currency:c.*");
 
for (var i = 0; i < e.instances.length; i++) {
    if (_r1.test(e.instances[i].modelID)) {
        e.instances[i].value = 999998;
    }
}
 
//MAX TROPHIES
var _r1 = new RegExp("Currency:t.*");
 
for (var i = 0; i < e.instances.length; i++) {
    if (_r1.test(e.instances[i].modelID)) {
        e.instances[i].value = 99998;
    }
}
 
//MAX LEVEL:
var _r1 = new RegExp("Item:pl.*");
 
for (var i = 0; i < e.instances.length; i++) {
    if (_r1.test(e.instances[i].modelID)) {
        e.instances[i].stats.xp = 2000000;
        e.instances[i].stats.lastClaimedLevel = 50;
    }
	}

//SET ALL CHAMPIONS  TO LEVEL 50
var _r1= new RegExp("Item:.");
for( var i = 0; i < e.instances.length; i++){
if(_r1.test(e.instances[i].modelID)){
e.instances[i].stats.level = 50;
}
}
 
//Get all new sidekicks
var count = e.instances.length - 6;
e.instances[count++].modelID = "Item:sidekick:FC14";
e.instances[count++].modelID = "Item:sidekick:LC11";
e.instances[count++].modelID = "Item:sidekick:NC11";
e.instances[count++].modelID = "Item:sidekick:SC12";
e.instances[count++].modelID = "Item:sidekick:WC15";
e.instances[count++].modelID = "Item:sidekick:PC00";
 
//Max Sidekick
for (var i = e.instances.length - 6; i < e.instances.length; i++) {
    e.instances[i].stats.xp = 125800;
    e.instances[i].stats.maturity = 3;
    e.instances[i].stats.zodiacBonus = 2;
}

12.	Bấm sang tab SOURCES, Click vào hàng số thứ tự ở bên trái dòng var i = this._cachedKeys[t]
13.	Bấm RESUME SCRIPT EXECUTION ở trên cùng bên PHẢI khung soạn thảo code. TẬN HƯỞNG NHÉ!
14.	BONUS: CÁCH ĐÁNH BOSS 1 HIT CHẾT LUÔN.
15.	Click vào BOSS RAIDS để chuẩn bị đánh BOSS. Giữ nguyên màn hình ở đấy chưa đc động thủ.
16.	CHUỘT PHẢI -> CHỌN INSPECT
17.	CHỌN TAB CONSOLE
18.	Kéo lên xuống để tìm VMxxx:xxx (xxx là số), Click vào nó
19.	Click vào nút Pretty Print {} ở dưới cùng bên trái khung soạn thảo
20.	Click chuột vào bên trong khung soạn thảo. Sau đó bấm tổ hợp phím Ctrl+F để bật ra khung tìm kiếm
21.	Dán dòng sau vào: 

this.doubleShotTimer.s

22.	Click vào hàng số thứ tự ở bên trái dòng nào có dạng như sau: this.magnetTimer.step(e)
23.	Bên khung hiển thị trò chơi, bấm FIGHT, lúc này, bên khung soạn thảo code, dòng this.magnetTimer.step(e) sẽ sáng lên
24.	Bấm vào tab CONSOLE
25.	Sao chép và dán lệnh: 

this.bossRaidDamage = 999999999

vào rồi ENTER
26.	Bấm sang tab SOURCES, Click vào hàng số thứ tự ở bên trái dòng this.magnetTimer.step(e)
27.	Bấm RESUME SCRIPT EXECUTION ở trên cùng bên trái khung soạn thảo code. Cho nhân vật đâm đầu vào quả lửa màu đỏ để chết là xong. Khi out ra sẽ thấy BOSS đã được KILL. TẬN HƯỞNG NHÉ!
