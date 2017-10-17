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
