"use strict";!function(){function a(a,t){(t=t).hasClass("phrase-additional-text--active")&&(t.slideUp(),t.toggleClass("phrase-additional-text--active")),Aria.expandingButton($(this)),a.hasClass("phrase-additional-text--active")?a.slideUp():a.slideDown(),a.toggleClass("phrase-additional-text--active")}$(".phrase-actions-additional-link-addtional-info").on("click",function(){a($(this).parent().find(".phrase-additional-text-addtional-info"),$(this).parent().find(".phrase-additional-text-translate"))}),$(".phrase-actions-additional-link-translate").on("click",function(){a($(this).parent().find(".phrase-additional-text-translate"),$(this).parent().find(".phrase-additional-text-addtional-info"))})}();