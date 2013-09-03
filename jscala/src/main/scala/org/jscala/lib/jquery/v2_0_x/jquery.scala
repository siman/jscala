package org.jscala
package lib.jquery.v2_0_x

// TODO: Resolve/review all functions with optional arguments.
// TODO: Resolve duplicates of function declarations.
// TODO: Implement classes: HTMLElement, PopStateEvent, Event, XMLHttpRequest. Are they defined in TypeScript?
// TODO: Add annotation (@JsName) to support some names that are valid in JS (val, type, clone) but not in Scala.

/** Initially generated
  * by [https://github.com/siman/scala-js-ts-importer]
  * from [https://github.com/borisyankov/DefinitelyTyped/blob/2e403eefa0f8f0819f48e2789e62fb9d1ef6e915/jquery/jquery.d.ts]
  */
trait JQueryAjaxSettings extends Object {
  var accepts: Any = _
  var async: Boolean = _
  def beforeSend(jqXHR: JQueryXHR, settings: JQueryAjaxSettings): JsDynamic = ???
  var cache: Boolean = _
  def complete(jqXHR: JQueryXHR, textStatus: String): JsDynamic = ???
  var contents: Any = _
  var contentType: Any = _
  var context: Any = _
  var converters: Any = _
  var crossDomain: Boolean = _
  var data: Any = _
  def dataFilter(data: Any, ty: Any): JsDynamic = ???
  var dataType: String = _
  def error(jqXHR: JQueryXHR, textStatus: String, errorThrow: String): JsDynamic = ???
  var global: Boolean = _
  var headers: Any = _
  var ifModified: Boolean = _
  var isLocal: Boolean = _
  var jsonp: String = _
  var jsonpCallback: Any = _
  var mimeType: String = _
  var password: String = _
  var processData: Boolean = _
  var scriptCharset: String = _
  var statusCode: Any = _
  def success(data: Any, textStatus: String, jqXHR: JQueryXHR): JsDynamic = ???
  var timeout: Number = _
  var traditional: Boolean = _
  var `type`: String = _
  var url: String = _
  var username: String = _
  var xhr: Any = _
  var xhrFields: Any = _
}

trait JQueryXHR extends XMLHttpRequest with JQueryPromise[Any] {
  def overrideMimeType(mimeType: String): JsDynamic = ???
  def abort(statusText: String): Unit = ???
  def abort(): Unit = ???
}

trait JQueryCallback extends Object {
  def add(callbacks: Any*): JsDynamic = ???
  def disable(): JsDynamic = ???
  def empty(): JsDynamic = ???
  def fire(arguments: Any*): JsDynamic = ???
  def fired(): Boolean = ???
  def fireWith(context: Any, args: Any*): JsDynamic = ???
  def has(callback: Any): Boolean = ???
  def lock(): JsDynamic = ???
  def locked(): Boolean = ???
  def remove(callbacks: Any*): JsDynamic = ???
}

trait JQueryGenericPromise[T] extends Object {
  def then[U](onFulfill: (T) => U, onReject: (Any) => U): JQueryGenericPromise[U] = ???
  def then[U](onFulfill: (T) => U): JQueryGenericPromise[U] = ???
  def then[U](onFulfill: (T) => JQueryGenericPromise[U], onReject: (Any) => U): JQueryGenericPromise[U] = ???
  def then[U](onFulfill: (T) => JQueryGenericPromise[U]): JQueryGenericPromise[U] = ???
  def then[U](onFulfill: (T) => U, onReject: (Any) => JQueryGenericPromise[U]): JQueryGenericPromise[U] = ???
  def then[U](onFulfill: (T) => U): JQueryGenericPromise[U] = ???
  def then[U](onFulfill: (T) => JQueryGenericPromise[U], onReject: (Any) => JQueryGenericPromise[U]): JQueryGenericPromise[U] = ???
  def then[U](onFulfill: (T) => JQueryGenericPromise[U]): JQueryGenericPromise[U] = ???
}

trait JQueryPromise[T] extends Object {
  def always(alwaysCallbacks: Any*): JQueryPromise[T] = ???
  def done(doneCallbacks: Any*): JQueryPromise[T] = ???
  def fail(failCallbacks: Any*): JQueryPromise[T] = ???
  def progress(progressCallbacks: Any*): JQueryPromise[T] = ???
  def pipe(doneFilter: (Any) => Any, failFilter: (Any) => Any, progressFilter: (Any) => Any): JQueryPromise[Any] = ???
  def pipe(doneFilter: (Any) => Any, failFilter: (Any) => Any): JQueryPromise[Any] = ???
  def pipe(doneFilter: (Any) => Any): JQueryPromise[Any] = ???
  def pipe(): JQueryPromise[Any] = ???
  def then[U](onFulfill: (T) => U, onReject: () => Any, onProgress: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => U, onReject: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => U): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => JQueryGenericPromise[U], onReject: () => Any, onProgress: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => JQueryGenericPromise[U], onReject: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => JQueryGenericPromise[U]): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => U, onReject: () => Any, onProgress: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => U, onReject: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => U): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => JQueryGenericPromise[U], onReject: () => Any, onProgress: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => JQueryGenericPromise[U], onReject: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: (T) => JQueryGenericPromise[U]): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any, onReject: () => Any, onProgress: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any, onReject: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any, onReject: () => Any, onProgress: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any, onReject: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any, onReject: () => Any, onProgress: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any, onReject: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any, onReject: () => Any, onProgress: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any, onReject: () => Any): JQueryPromise[U] = ???
  def then[U](onFulfill: () => Any): JQueryPromise[U] = ???
}

trait JQueryDeferred[T] extends JQueryPromise[T] {
  override def always(alwaysCallbacks: Any*): JQueryDeferred[T] = ???
  override def done(doneCallbacks: Any*): JQueryDeferred[T] = ???
  override def fail(failCallbacks: Any*): JQueryDeferred[T] = ???
  override def progress(progressCallbacks: Any*): JQueryDeferred[T] = ???
  def notify(args: Any*): JQueryDeferred[T] = ???
  def notifyWith(context: Any, args: Any*): JQueryDeferred[T] = ???
  def reject(args: Any*): JQueryDeferred[T] = ???
  def rejectWith(context: Any, args: Any*): JQueryDeferred[T] = ???
  def resolve(`val`: T): JQueryDeferred[T] = ???
  def resolve(args: Any*): JQueryDeferred[T] = ???
  def resolveWith(context: Any, args: Any*): JQueryDeferred[T] = ???
  def state(): String = ???
  def promise(target: Any): JQueryPromise[T] = ???
  def promise(): JQueryPromise[T] = ???
}

trait BaseJQueryEventObject extends Event {
  var data: Any = _
  var delegateTarget: Element = _
  def isDefaultPrevented(): Boolean = ???
  def isPropagationStopped(): Boolean = ???
  def isImmediatePropagationStopped(): Boolean = ???
  var namespace: String = _
  def preventDefault(): JsDynamic = ???
  var relatedTarget: Element = _
  var result: Any = _
  def stopImmediatePropagation(): Unit = ???
  def stopPropagation(): Unit = ???
  var pageX: Number = _
  var pageY: Number = _
  var which: Number = _
  var metaKey: Any = _
}

trait JQueryInputEventObject extends BaseJQueryEventObject {
  var altKey: Boolean = _
  var ctrlKey: Boolean = _
  override var metaKey: Boolean = _
  var shiftKey: Boolean = _
}

trait JQueryMouseEventObject extends JQueryInputEventObject {
  var button: Number = _
  var clientX: Number = _
  var clientY: Number = _
  var offsetX: Number = _
  var offsetY: Number = _
  var screenX: Number = _
  var screenY: Number = _
}

trait JQueryKeyEventObject extends JQueryInputEventObject {
  var char: Any = _
  var charCode: Number = _
  var key: Any = _
  var keyCode: Number = _
}

trait JQueryPopStateEventObject extends BaseJQueryEventObject {
  var originalEvent: PopStateEvent = _
}

trait JQueryEventObject extends BaseJQueryEventObject with JQueryInputEventObject with JQueryMouseEventObject with JQueryKeyEventObject with JQueryPopStateEventObject {
}

trait JQuerySupport extends Object {
  var ajax: Boolean = _
  var boxModel: Boolean = _
  var changeBubbles: Boolean = _
  var checkClone: Boolean = _
  var checkOn: Boolean = _
  var cors: Boolean = _
  var cssFloat: Boolean = _
  var hrefNormalized: Boolean = _
  var htmlSerialize: Boolean = _
  var leadingWhitespace: Boolean = _
  var noCloneChecked: Boolean = _
  var noCloneEvent: Boolean = _
  var opacity: Boolean = _
  var optDisabled: Boolean = _
  var optSelected: Boolean = _
  def scriptEval(): Boolean = ???
  var style: Boolean = _
  var submitBubbles: Boolean = _
  var tbody: Boolean = _
}

trait JQueryParam extends Object {
  def apply(obj: Any): String = ???
  def apply(obj: Any, traditional: Boolean): String = ???
}

trait JQueryStatic extends Object {
  def ajax(settings: JQueryAjaxSettings): JQueryXHR = ???
  def ajax(url: String, settings: JQueryAjaxSettings): JQueryXHR = ???
  def ajax(url: String): JQueryXHR = ???
  def ajaxPrefilter(dataTypes: String, handler: (Any, Any, JQueryXHR) => Any): JsDynamic = ???
  def ajaxPrefilter(handler: (Any, Any, JQueryXHR) => Any): JsDynamic = ???
  var ajaxSettings: JQueryAjaxSettings = _
  def ajaxSetup(): Unit = ???
  def ajaxSetup(options: JQueryAjaxSettings): Unit = ???
  def get(url: String, data: Any, success: Any, dataType: Any): JQueryXHR = ???
  def get(url: String, data: Any, success: Any): JQueryXHR = ???
  def get(url: String, data: Any): JQueryXHR = ???
  def get(url: String): JQueryXHR = ???
  def getJSON(url: String, data: Any, success: Any): JQueryXHR = ???
  def getJSON(url: String, data: Any): JQueryXHR = ???
  def getJSON(url: String): JQueryXHR = ???
  def getScript(url: String, success: Any): JQueryXHR = ???
  def getScript(url: String): JQueryXHR = ???
  var param: JQueryParam = _
  def post(url: String, data: Any, success: Any, dataType: Any): JQueryXHR = ???
  def post(url: String, data: Any, success: Any): JQueryXHR = ???
  def post(url: String, data: Any): JQueryXHR = ???
  def post(url: String): JQueryXHR = ???
  def Callbacks(flags: String): JQueryCallback = ???
  def Callbacks(): JQueryCallback = ???
  def holdReady(hold: Boolean): JsDynamic = ???
  def apply(selector: String, context: Any): JQuery = ???
  def apply(selector: String): JQuery = ???
  def apply(element: Element): JQuery = ???
  def apply(`object`: Any): JQuery = ???
  def apply(elementArray: Array[Element]): JQuery = ???
  def apply(`object`: JQuery): JQuery = ???
  def apply(func: Function): JQuery = ???
  def apply(array: Array[Any]): JQuery = ???
  def apply(): JQuery = ???
  def noConflict(removeAll: Boolean): Object = ???
  def noConflict(): Object = ???
  def when[T](deferreds: JQueryGenericPromise[T]*): JQueryPromise[T] = ???
  def when[T](deferreds: T*): JQueryPromise[T] = ???
  def when[T](deferreds: Any*): JQueryPromise[T] = ???
  def css(e: Any, propertyName: String, value: Any): JsDynamic = ???
  def css(e: Any, propertyName: String): JsDynamic = ???
  def css(e: Any, propertyName: Any, value: Any): JsDynamic = ???
  def css(e: Any, propertyName: Any): JsDynamic = ???
  var cssHooks: Any = _
  var cssNumber: Any = _
  def data(element: Element, key: String, value: Any): JsDynamic = ???
  def data(element: Element, key: String): JsDynamic = ???
  def data(element: Element): JsDynamic = ???
  def dequeue(element: Element, queueName: String): JsDynamic = ???
  def dequeue(element: Element): JsDynamic = ???
  def hasData(element: Element): Boolean = ???
  def queue(element: Element, queueName: String): Array[Any] = ???
  def queue(element: Element): Array[Any] = ???
  def queue(element: Element, queueName: String, newQueueOrCallback: Any): JQuery = ???
  def removeData(element: Element, name: String): JQuery = ???
  def removeData(element: Element): JQuery = ???
  def Deferred[T](beforeStart: (JQueryDeferred) => Any): JQueryDeferred[T] = ???
  def Deferred[T](): JQueryDeferred[T] = ???
  var fx: Any = _
  def proxy(fn: () => Any, context: Any, args: Any*): JsDynamic = ???
  def proxy(context: Any, name: String, args: Any*): JsDynamic = ???
  var Event: Any = _
  def error(message: Any): JQuery = ???
  var expr: Any = _
  var fn: Any = _
  var isReady: Boolean = _
  var support: JQuerySupport = _
  def contains(container: Element, contained: Element): Boolean = ???
  def each(collection: Any, callback: (Any, Any) => Any): JsDynamic = ???
  def each(collection: JQuery, callback: (Number, HTMLElement) => Any): JsDynamic = ???
  def each[T](collection: Array[T], callback: (Number, T) => Any): JsDynamic = ???
  def extend(target: Any, objs: Any*): JsDynamic = ???
  def extend(deep: Boolean, target: Any, objs: Any*): JsDynamic = ???
  def globalEval(code: String): JsDynamic = ???
  def grep[T](array: Array[T], func: (T, Number) => Boolean, invert: Boolean): Array[T] = ???
  def grep[T](array: Array[T], func: (T, Number) => Boolean): Array[T] = ???
  def inArray[T](value: T, array: Array[T], fromIndex: Number): Number = ???
  def inArray[T](value: T, array: Array[T]): Number = ???
  def isArray(obj: Any): Boolean = ???
  def isEmptyObject(obj: Any): Boolean = ???
  def isFunction(obj: Any): Boolean = ???
  def isNumeric(value: Any): Boolean = ???
  def isPlainObject(obj: Any): Boolean = ???
  def isWindow(obj: Any): Boolean = ???
  def isXMLDoc(node: Node): Boolean = ???
  def makeArray(obj: Any): Array[Any] = ???
  def map[T, U](array: Array[T], callback: (T, Number) => U): Array[U] = ???
  def map(array: Any, callback: (Any, Any) => Any): JsDynamic = ???
  def merge[T](first: Array[T], second: Array[T]): Array[T] = ???
  def merge[T, U](first: Array[T], second: Array[U]): Array[Any] = ???
  def noop(): JsDynamic = ???
  def now(): Number = ???
  def parseJSON(json: String): JsDynamic = ???
  def parseXML(data: String): JsDynamic = ???
  def queue(element: Element, queueName: String, newQueue: Array[Any]): JQuery = ???
  def trim(str: String): String = ???
  def `type`(obj: Any): String = ???
  def unique(arr: Array[Any]): Array[Any] = ???
  def parseHTML(data: String, context: HTMLElement, keepScripts: Boolean): Array[Any] = ???
  def parseHTML(data: String, context: HTMLElement): Array[Any] = ???
  def parseHTML(data: String): Array[Any] = ???
  def Animation(elem: Any, properties: Any, options: Any): JsDynamic = ???
}

trait JQuery extends Object {
  def ajaxComplete(handler: Any): JQuery = ???
  def ajaxError(handler: (Any, Any, Any, Any) => Any): JQuery = ???
  def ajaxSend(handler: (Any, Any, Any, Any) => Any): JQuery = ???
  def ajaxStart(handler: () => Any): JQuery = ???
  def ajaxStop(handler: () => Any): JQuery = ???
  def ajaxSuccess(handler: (Any, Any, Any, Any) => Any): JQuery = ???
  def load(url: String, data: Any, complete: Any): JQuery = ???
  def load(url: String, data: Any): JQuery = ???
  def load(url: String): JQuery = ???
  def serialize(): String = ???
  def serializeArray(): Array[Any] = ???
  def addClass(classNames: String): JQuery = ???
  def addClass(func: (Any, Any) => String): JQuery = ???
  def addBack(selector: String): JQuery = ???
  def addBack(): JQuery = ???
  def attr(attributeName: String): String = ???
  def attr(attributeName: String, value: Any): JQuery = ???
  def attr(map: Any): JQuery = ???
  def attr(attributeName: String, func: (Any, Any) => Any): JQuery = ???
  def hasClass(className: String): Boolean = ???
  def html(): String = ???
  def html(htmlString: String): JQuery = ???
  def html(htmlContent: (Number, String) => String): JQuery = ???
  def html(obj: JQuery): JQuery = ???
  def prop(propertyName: String): JsDynamic = ???
  def prop(propertyName: String, value: Any): JQuery = ???
  def prop(map: Any): JQuery = ???
  def prop(propertyName: String, func: (Any, Any) => Any): JQuery = ???
  def removeAttr(attributeName: Any): JQuery = ???
  def removeClass(className: Any): JQuery = ???
  def removeClass(): JQuery = ???
  def removeClass(func: (Any, Any) => Any): JQuery = ???
  def removeProp(propertyName: Any): JQuery = ???
  def toggleClass(className: Any, swtch: Boolean): JQuery = ???
  def toggleClass(className: Any): JQuery = ???
  def toggleClass(swtch: Boolean): JQuery = ???
  def toggleClass(): JQuery = ???
  def toggleClass(func: (Any, Any, Any) => Any): JQuery = ???
  def `val`(): JsDynamic = ???
  def `val`(value: Array[String]): JQuery = ???
  def `val`(value: String): JQuery = ???
  def `val`(value: Number): JQuery = ???
  def `val`(func: (Any, Any) => Any): JQuery = ???
  def css(propertyName: String): String = ???
  def css(propertyNames: Array[String]): String = ???
  def css(properties: Any): JQuery = ???
  def css(propertyName: String, value: Any): JQuery = ???
  def css(propertyName: Any, value: Any): JQuery = ???
  def height(): Number = ???
  def height(value: Number): JQuery = ???
  def height(value: String): JQuery = ???
  def height(func: (Any, Any) => Any): JQuery = ???
  def innerHeight(): Number = ???
  def innerHeight(value: Number): JQuery = ???
  def innerWidth(): Number = ???
  def innerWidth(value: Number): JQuery = ???
  def offset(): Any = ???
  def offset(coordinates: Any): JQuery = ???
  def offset(func: (Any, Any) => Any): JQuery = ???
  def outerHeight(includeMargin: Boolean): Number = ???
  def outerHeight(): Number = ???
  def outerHeight(value: Number, includeMargin: Boolean): JQuery = ???
  def outerHeight(value: Number): JQuery = ???
  def outerWidth(includeMargin: Boolean): Number = ???
  def outerWidth(): Number = ???
  def outerWidth(value: Number, includeMargin: Boolean): JQuery = ???
  def outerWidth(value: Number): JQuery = ???
  def position(): Any = ???
  def scrollLeft(): Number = ???
  def scrollLeft(value: Number): JQuery = ???
  def scrollTop(): Number = ???
  def scrollTop(value: Number): JQuery = ???
  def width(): Number = ???
  def width(value: Number): JQuery = ???
  def width(value: String): JQuery = ???
  def width(func: (Any, Any) => Any): JQuery = ???
  def clearQueue(queueName: String): JQuery = ???
  def clearQueue(): JQuery = ???
  def data(key: String, value: Any): JQuery = ???
  def data(obj: Any): JQuery = ???
  def data(key: String): JsDynamic = ???
  def data(): JsDynamic = ???
  def dequeue(queueName: String): JQuery = ???
  def dequeue(): JQuery = ???
  def removeData(nameOrList: Any): JQuery = ???
  def removeData(): JQuery = ???
  def promise(`type`: Any, target: Any): JQueryPromise[Any] = ???
  def promise(`type`: Any): JQueryPromise[Any] = ???
  def promise(): JQueryPromise[Any] = ???
  def animate(properties: Any, duration: Any, complete: Function): JQuery = ???
  def animate(properties: Any, duration: Any): JQuery = ???
  def animate(properties: Any): JQuery = ???
  def animate(properties: Any, duration: Any, easing: String, complete: Function): JQuery = ???
  def animate(properties: Any, duration: Any, easing: String): JQuery = ???
  def animate(properties: Any, duration: Any): JQuery = ???
  def animate(properties: Any): JQuery = ???
  def animate(properties: Any, options: Any): JQuery = ???
  def delay(duration: Number, queueName: String): JQuery = ???
  def delay(duration: Number): JQuery = ???
  def fadeIn(duration: Any, callback: Any): JQuery = ???
  def fadeIn(duration: Any): JQuery = ???
  def fadeIn(): JQuery = ???
  def fadeIn(duration: Any, easing: String, callback: Any): JQuery = ???
  def fadeIn(duration: Any, easing: String): JQuery = ???
  def fadeIn(duration: Any): JQuery = ???
  def fadeIn(): JQuery = ???
  def fadeOut(duration: Any, callback: Any): JQuery = ???
  def fadeOut(duration: Any): JQuery = ???
  def fadeOut(): JQuery = ???
  def fadeOut(duration: Any, easing: String, callback: Any): JQuery = ???
  def fadeOut(duration: Any, easing: String): JQuery = ???
  def fadeOut(duration: Any): JQuery = ???
  def fadeOut(): JQuery = ???
  def fadeTo(duration: Any, opacity: Number, callback: Any): JQuery = ???
  def fadeTo(duration: Any, opacity: Number): JQuery = ???
  def fadeTo(duration: Any, opacity: Number, easing: String, callback: Any): JQuery = ???
  def fadeTo(duration: Any, opacity: Number, easing: String): JQuery = ???
  def fadeTo(duration: Any, opacity: Number): JQuery = ???
  def fadeToggle(duration: Any, callback: Any): JQuery = ???
  def fadeToggle(duration: Any): JQuery = ???
  def fadeToggle(): JQuery = ???
  def fadeToggle(duration: Any, easing: String, callback: Any): JQuery = ???
  def fadeToggle(duration: Any, easing: String): JQuery = ???
  def fadeToggle(duration: Any): JQuery = ???
  def fadeToggle(): JQuery = ???
  def finish(): JQuery = ???
  def hide(duration: Any, callback: Any): JQuery = ???
  def hide(duration: Any): JQuery = ???
  def hide(): JQuery = ???
  def hide(duration: Any, easing: String, callback: Any): JQuery = ???
  def hide(duration: Any, easing: String): JQuery = ???
  def hide(duration: Any): JQuery = ???
  def hide(): JQuery = ???
  def show(duration: Any, callback: Any): JQuery = ???
  def show(duration: Any): JQuery = ???
  def show(): JQuery = ???
  def show(duration: Any, easing: String, callback: Any): JQuery = ???
  def show(duration: Any, easing: String): JQuery = ???
  def show(duration: Any): JQuery = ???
  def show(): JQuery = ???
  def slideDown(duration: Any, callback: Any): JQuery = ???
  def slideDown(duration: Any): JQuery = ???
  def slideDown(): JQuery = ???
  def slideDown(duration: Any, easing: String, callback: Any): JQuery = ???
  def slideDown(duration: Any, easing: String): JQuery = ???
  def slideDown(duration: Any): JQuery = ???
  def slideDown(): JQuery = ???
  def slideToggle(duration: Any, callback: Any): JQuery = ???
  def slideToggle(duration: Any): JQuery = ???
  def slideToggle(): JQuery = ???
  def slideToggle(duration: Any, easing: String, callback: Any): JQuery = ???
  def slideToggle(duration: Any, easing: String): JQuery = ???
  def slideToggle(duration: Any): JQuery = ???
  def slideToggle(): JQuery = ???
  def slideUp(duration: Any, callback: Any): JQuery = ???
  def slideUp(duration: Any): JQuery = ???
  def slideUp(): JQuery = ???
  def slideUp(duration: Any, easing: String, callback: Any): JQuery = ???
  def slideUp(duration: Any, easing: String): JQuery = ???
  def slideUp(duration: Any): JQuery = ???
  def slideUp(): JQuery = ???
  def stop(clearQueue: Boolean, jumpToEnd: Boolean): JQuery = ???
  def stop(clearQueue: Boolean): JQuery = ???
  def stop(): JQuery = ???
  def stop(queue: Any, clearQueue: Boolean, jumpToEnd: Boolean): JQuery = ???
  def stop(queue: Any, clearQueue: Boolean): JQuery = ???
  def stop(queue: Any): JQuery = ???
  def stop(): JQuery = ???
  def toggle(duration: Any, callback: Any): JQuery = ???
  def toggle(duration: Any): JQuery = ???
  def toggle(): JQuery = ???
  def toggle(duration: Any, easing: String, callback: Any): JQuery = ???
  def toggle(duration: Any, easing: String): JQuery = ???
  def toggle(duration: Any): JQuery = ???
  def toggle(): JQuery = ???
  def toggle(showOrHide: Boolean): JQuery = ???
  def bind(eventType: String, eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def bind(eventType: String, eventData: Any): JQuery = ???
  def bind(eventType: String): JQuery = ???
  def bind(eventType: String, eventData: Any, preventBubble: Boolean): JQuery = ???
  def bind(eventType: String, preventBubble: Boolean): JQuery = ???
  def bind(events: Any*): JQuery = ???
  def blur(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def blur(eventData: Any): JQuery = ???
  def blur(): JQuery = ???
  def blur(handler: (JQueryEventObject) => Any): JQuery = ???
  def change(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def change(eventData: Any): JQuery = ???
  def change(): JQuery = ???
  def change(handler: (JQueryEventObject) => Any): JQuery = ???
  def click(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def click(eventData: Any): JQuery = ???
  def click(): JQuery = ???
  def click(handler: (JQueryEventObject) => Any): JQuery = ???
  def dblclick(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def dblclick(eventData: Any): JQuery = ???
  def dblclick(): JQuery = ???
  def dblclick(handler: (JQueryEventObject) => Any): JQuery = ???
  def delegate(selector: Any, eventType: String, handler: (JQueryEventObject) => Any): JQuery = ???
  def focus(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def focus(eventData: Any): JQuery = ???
  def focus(): JQuery = ???
  def focus(handler: (JQueryEventObject) => Any): JQuery = ???
  def focusin(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def focusin(handler: (JQueryEventObject) => Any): JQuery = ???
  def focusout(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def focusout(handler: (JQueryEventObject) => Any): JQuery = ???
  def hover(handlerIn: (JQueryEventObject) => Any, handlerOut: (JQueryEventObject) => Any): JQuery = ???
  def hover(handlerInOut: (JQueryEventObject) => Any): JQuery = ???
  def keydown(eventData: Any, handler: (JQueryKeyEventObject) => Any): JQuery = ???
  def keydown(eventData: Any): JQuery = ???
  def keydown(): JQuery = ???
  def keydown(handler: (JQueryKeyEventObject) => Any): JQuery = ???
  def keypress(eventData: Any, handler: (JQueryKeyEventObject) => Any): JQuery = ???
  def keypress(eventData: Any): JQuery = ???
  def keypress(): JQuery = ???
  def keypress(handler: (JQueryKeyEventObject) => Any): JQuery = ???
  def keyup(eventData: Any, handler: (JQueryKeyEventObject) => Any): JQuery = ???
  def keyup(eventData: Any): JQuery = ???
  def keyup(): JQuery = ???
  def keyup(handler: (JQueryKeyEventObject) => Any): JQuery = ???
  def load(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def load(eventData: Any): JQuery = ???
  def load(): JQuery = ???
  def load(handler: (JQueryEventObject) => Any): JQuery = ???
  def mousedown(): JQuery = ???
  def mousedown(eventData: Any, handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mousedown(handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseevent(eventData: Any, handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseevent(handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseenter(): JQuery = ???
  def mouseenter(eventData: Any, handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseenter(handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseleave(): JQuery = ???
  def mouseleave(eventData: Any, handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseleave(handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mousemove(): JQuery = ???
  def mousemove(eventData: Any, handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mousemove(handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseout(): JQuery = ???
  def mouseout(eventData: Any, handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseout(handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseover(): JQuery = ???
  def mouseover(eventData: Any, handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseover(handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseup(): JQuery = ???
  def mouseup(eventData: Any, handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def mouseup(handler: (JQueryMouseEventObject) => Any): JQuery = ???
  def off(events: String, selector: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def off(events: String, selector: Any): JQuery = ???
  def off(events: String): JQuery = ???
  def off(): JQuery = ???
  def off(eventsMap: Any, selector: Any): JQuery = ???
  def off(eventsMap: Any): JQuery = ???
  def on(events: String, selector: Any, data: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def on(events: String, selector: Any, data: Any): JQuery = ???
  def on(events: String, selector: Any): JQuery = ???
  def on(events: String): JQuery = ???
  def on(events: String, selector: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def on(events: String, selector: Any): JQuery = ???
  def on(events: String): JQuery = ???
  def on(eventsMap: Any, selector: Any, data: Any): JQuery = ???
  def on(eventsMap: Any, selector: Any): JQuery = ???
  def on(eventsMap: Any): JQuery = ???
  def one(events: String, selector: Any, data: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def one(events: String, selector: Any, data: Any): JQuery = ???
  def one(events: String, selector: Any): JQuery = ???
  def one(events: String): JQuery = ???
  def one(eventsMap: Any, selector: Any, data: Any): JQuery = ???
  def one(eventsMap: Any, selector: Any): JQuery = ???
  def one(eventsMap: Any): JQuery = ???
  def ready(handler: Any): JQuery = ???
  def resize(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def resize(eventData: Any): JQuery = ???
  def resize(): JQuery = ???
  def resize(handler: (JQueryEventObject) => Any): JQuery = ???
  def scroll(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def scroll(eventData: Any): JQuery = ???
  def scroll(): JQuery = ???
  def scroll(handler: (JQueryEventObject) => Any): JQuery = ???
  def select(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def select(eventData: Any): JQuery = ???
  def select(): JQuery = ???
  def select(handler: (JQueryEventObject) => Any): JQuery = ???
  def submit(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def submit(eventData: Any): JQuery = ???
  def submit(): JQuery = ???
  def submit(handler: (JQueryEventObject) => Any): JQuery = ???
  def trigger(eventType: String, extraParameters: Any*): JQuery = ???
  def trigger(event: JQueryEventObject): JQuery = ???
  def triggerHandler(eventType: String, extraParameters: Any*): Object = ???
  def unbind(eventType: String, handler: (JQueryEventObject) => Any): JQuery = ???
  def unbind(eventType: String): JQuery = ???
  def unbind(): JQuery = ???
  def unbind(eventType: String, fls: Boolean): JQuery = ???
  def unbind(evt: Any): JQuery = ???
  def undelegate(): JQuery = ???
  def undelegate(selector: Any, eventType: String, handler: (JQueryEventObject) => Any): JQuery = ???
  def undelegate(selector: Any, eventType: String): JQuery = ???
  def undelegate(selector: Any, events: Any): JQuery = ???
  def undelegate(namespace: String): JQuery = ???
  def unload(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def unload(eventData: Any): JQuery = ???
  def unload(): JQuery = ???
  def unload(handler: (JQueryEventObject) => Any): JQuery = ???
  var context: Element = _
  var jquery: String = _
  def error(handler: (JQueryEventObject) => Any): JQuery = ???
  def error(eventData: Any, handler: (JQueryEventObject) => Any): JQuery = ???
  def pushStack(elements: Array[Any]): JQuery = ???
  def pushStack(elements: Array[Any], name: Any, arguments: Any): JQuery = ???
  def after(content: Any*): JQuery = ???
  def after(func: (Any) => Any): JQuery = ???
  def append(content: Any*): JQuery = ???
  def append(func: (Any, Any) => Any): JQuery = ???
  def appendTo(target: Any): JQuery = ???
  def before(content: Any*): JQuery = ???
  def before(func: (Any) => Any): JQuery = ???
  def clone(withDataAndEvents: Boolean, deepWithDataAndEvents: Boolean): JQuery = ???
  def clone(withDataAndEvents: Boolean): JQuery = ???
  override def clone(): JQuery = ???
  def detach(selector: Any): JQuery = ???
  def detach(): JQuery = ???
  def empty(): JQuery = ???
  def insertAfter(target: Any): JQuery = ???
  def insertBefore(target: Any): JQuery = ???
  def prepend(content: Any*): JQuery = ???
  def prepend(func: (Any, Any) => Any): JQuery = ???
  def prependTo(target: Any): JQuery = ???
  def remove(selector: Any): JQuery = ???
  def remove(): JQuery = ???
  def replaceAll(target: Any): JQuery = ???
  def replaceWith(func: Any): JQuery = ???
  def text(): String = ???
  def text(textString: Any): JQuery = ???
  def text(textString: (Number, String) => String): JQuery = ???
  def toArray(): Array[Any] = ???
  def unwrap(): JQuery = ???
  def wrap(wrappingElement: Any): JQuery = ???
  def wrap(func: (Any) => Any): JQuery = ???
  def wrapAll(wrappingElement: Any): JQuery = ???
  def wrapInner(wrappingElement: Any): JQuery = ???
  def wrapInner(func: (Any) => Any): JQuery = ???
  def each(func: (Any, Element) => Any): JQuery = ???
  def get(index: Number): JsDynamic = ???
  def get(): JsDynamic = ???
  def index(): Number = ???
  def index(selector: String): Number = ???
  def index(element: Any): Number = ???
  var length: Number = _
  var selector: String = _


  // TODO: WTF is this? looks like generated by Ts2Scala converter.
/* ??? IndexMember(FunSignature(List(),List(FunParam(Ident(x),false,Some(TypeRef(CoreType(string),List())))),Some(TypeRef(CoreType(any),List())))) */
/* ??? IndexMember(FunSignature(List(),List(FunParam(Ident(x),false,Some(TypeRef(CoreType(number),List())))),Some(TypeRef(TypeName(HTMLElement),List())))) */


  def add(selector: String, context: Any): JQuery = ???
  def add(selector: String): JQuery = ???
  def add(elements: Any*): JQuery = ???
  def add(html: String): JQuery = ???
  def add(obj: JQuery): JQuery = ???
  def children(selector: Any): JQuery = ???
  def children(): JQuery = ???
  def closest(selector: String): JQuery = ???
  def closest(selector: String, context: Element): JQuery = ???
  def closest(selector: String): JQuery = ???
  def closest(obj: JQuery): JQuery = ???
  def closest(element: Any): JQuery = ???
  def closest(selectors: Any, context: Element): Array[Any] = ???
  def closest(selectors: Any): Array[Any] = ???
  def contents(): JQuery = ???
  def end(): JQuery = ???
  def eq(index: Number): JQuery = ???
  def filter(selector: String): JQuery = ???
  def filter(func: (Any) => Any): JQuery = ???
  def filter(element: Any): JQuery = ???
  def filter(obj: JQuery): JQuery = ???
  def find(selector: String): JQuery = ???
  def find(element: Any): JQuery = ???
  def find(obj: JQuery): JQuery = ???
  def first(): JQuery = ???
  def has(selector: String): JQuery = ???
  def has(contained: Element): JQuery = ???
  def is(selector: String): Boolean = ???
  def is(func: (Any) => Any): Boolean = ???
  def is(element: Any): Boolean = ???
  def is(obj: JQuery): Boolean = ???
  def last(): JQuery = ???
  def map(callback: (Any, Element) => Any): JQuery = ???
  def next(selector: String): JQuery = ???
  def next(): JQuery = ???
  def nextAll(selector: String): JQuery = ???
  def nextAll(): JQuery = ???
  def nextUntil(selector: String, filter: String): JQuery = ???
  def nextUntil(selector: String): JQuery = ???
  def nextUntil(): JQuery = ???
  def nextUntil(element: Element, filter: String): JQuery = ???
  def nextUntil(element: Element): JQuery = ???
  def nextUntil(): JQuery = ???
  def not(selector: String): JQuery = ???
  def not(func: (Any) => Any): JQuery = ???
  def not(element: Any): JQuery = ???
  def not(obj: JQuery): JQuery = ???
  def offsetParent(): JQuery = ???
  def parent(selector: String): JQuery = ???
  def parent(): JQuery = ???
  def parents(selector: String): JQuery = ???
  def parents(): JQuery = ???
  def parentsUntil(selector: String, filter: String): JQuery = ???
  def parentsUntil(selector: String): JQuery = ???
  def parentsUntil(): JQuery = ???
  def parentsUntil(element: Element, filter: String): JQuery = ???
  def parentsUntil(element: Element): JQuery = ???
  def parentsUntil(): JQuery = ???
  def parentsUntil(obj: JQuery, filter: String): JQuery = ???
  def parentsUntil(obj: JQuery): JQuery = ???
  def parentsUntil(): JQuery = ???
  def prev(selector: String): JQuery = ???
  def prev(): JQuery = ???
  def prevAll(selector: String): JQuery = ???
  def prevAll(): JQuery = ???
  def prevUntil(selector: String, filter: String): JQuery = ???
  def prevUntil(selector: String): JQuery = ???
  def prevUntil(): JQuery = ???
  def prevUntil(element: Element, filter: String): JQuery = ???
  def prevUntil(element: Element): JQuery = ???
  def prevUntil(): JQuery = ???
  def siblings(selector: String): JQuery = ???
  def siblings(): JQuery = ???
  def slice(start: Number, end: Number): JQuery = ???
  def slice(start: Number): JQuery = ???
  def queue(queueName: String): Array[Any] = ???
  def queue(): Array[Any] = ???
  def queue(queueName: String, newQueueOrCallback: Any): JQuery = ???
  def queue(newQueueOrCallback: Any): JQuery = ???
}

trait JQueryGlobal {
  var jQuery: JQueryStatic = _
  var $: JQueryStatic = _
}
