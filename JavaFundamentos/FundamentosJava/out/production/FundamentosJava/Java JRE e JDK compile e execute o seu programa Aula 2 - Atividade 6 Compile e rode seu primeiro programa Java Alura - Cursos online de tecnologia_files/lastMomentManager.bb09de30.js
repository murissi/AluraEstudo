"use strict";function _classCallCheck(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function _defineProperties(e,t){for(var r=0;r<t.length;r++){var a=t[r];a.enumerable=a.enumerable||!1,a.configurable=!0,"value"in a&&(a.writable=!0),Object.defineProperty(e,a.key,a)}}function _createClass(e,t,r){return t&&_defineProperties(e.prototype,t),r&&_defineProperties(e,r),Object.defineProperty(e,"prototype",{writable:!1}),e}var LastMomentManager=function(){function t(e){_classCallCheck(this,t),this.storageKey=e,this.localRegistry=localStorage.getItem(e)?JSON.parse(localStorage.getItem(e)):{}}return _createClass(t,[{key:"updateRegistry",value:function(e){localStorage.setItem(this.storageKey,JSON.stringify(e))}},{key:"savePartialRegistryMoment",value:function(e,t,r){this.localRegistry[e]={registryId:e,currentTime:t,lastViewedMoment:r},this.updateRegistry(this.localRegistry)}},{key:"deletePartialRegistryMoment",value:function(e){delete this.localRegistry[e],this.updateRegistry(this.localRegistry)}},{key:"updateRegistryMomentListener",value:function(r,e,a){var i=this,s=setInterval(function(){var e=r(),t=e.registryId,e=e.currentTime;i.savePartialRegistryMoment(t,e,Date.now()),a-e<10&&(i.deletePartialRegistryMoment(t),clearInterval(s))},e);return s}},{key:"sweepLocalStorage",value:function(){var t=this,r=!1;Object.keys(this.localRegistry).forEach(function(e){6e8<Date.now()-t.localRegistry[e].lastViewed&&(r=!0,delete t.localRegistry[e])}),r&&this.updateRegistry()}},{key:"getActualTimeForRegistry",value:function(e){return this.localRegistry[e]?this.localRegistry[e].currentTime:0}}]),t}();