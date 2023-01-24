"use strict";function _classCallCheck(t,e){if(!(t instanceof e))throw new TypeError("Cannot call a class as a function")}function _defineProperties(t,e){for(var n=0;n<e.length;n++){var r=e[n];r.enumerable=r.enumerable||!1,r.configurable=!0,"value"in r&&(r.writable=!0),Object.defineProperty(t,r.key,r)}}function _createClass(t,e,n){return e&&_defineProperties(t.prototype,e),n&&_defineProperties(t,n),Object.defineProperty(t,"prototype",{writable:!1}),t}var Clipper=function(){function r(t,e,n){_classCallCheck(this,r),this._buttonText=t,this._successText=e,this._errorText=n,this.onLoad()}return _createClass(r,[{key:"appendButton",value:function(){var n=this;Array.from(document.querySelectorAll(".prettyprint")).filter(function(t){return!t.parentNode.classList.contains("alternativeList-item-alternative")}).forEach(function(t){var e=document.createElement("button");e.type="button",e.classList.add("clipit"),e.textContent=n._buttonText,t.appendChild(e)})}},{key:"configureClipboardJS",value:function(){var e=this,t=new ClipboardJS(".clipit",{target:function(t){return t.previousElementSibling}});t.on("success",function(t){t.trigger.textContent=e._successText,t.clearSelection(),t.trigger.classList.add("clipit-success"),setTimeout(function(){t.trigger.textContent=e._buttonText,t.trigger.classList.remove("clipit-success")},2e3)}),t.on("error",function(){alert(e._errorText)})}},{key:"onLoad",value:function(){window.addEventListener("load",function(){this.appendButton(),this.configureClipboardJS()}.bind(this))}}]),r}();