package series;
import org.apidesign.bck2brwsr.htmlpage.api.*;
final class Index {
  private boolean locked;
  public Index() {
  OnEvent.CLICK.of(HELLO).perform(new OnDispatch(0));
  }
class OnDispatch implements OnHandler {
  private final int dispatch;
  OnDispatch(int d) { dispatch = d; }
  public void onEvent(Object ev) {
    switch (dispatch) {
      case 0: App.hello(Index.this); break;
    }
  }
}
  public final Canvas CANVAS = new Canvas("canvas");
  public final Button HELLO = new Button("hello");
  public final Input INPUT = new Input("input");
public java.lang.String getHelloMessage() {
  if (locked) throw new IllegalStateException();
  java.lang.String arg1 = getName();
  try {
    locked = true;
    return App.helloMessage(arg1);
  } finally {
    locked = false;
  }
}
private java.lang.String prop_name;
public java.lang.String getName() {
  if (locked) throw new IllegalStateException();
  return prop_name;
}
public void setName(java.lang.String v) {
  if (locked) throw new IllegalStateException();
  prop_name = v;
  if (ko != null) {
    ko.valueHasMutated("name");
    ko.valueHasMutated("helloMessage");
  }
}
  private org.apidesign.bck2brwsr.htmlpage.Knockout ko;
public Index applyBindings() {
  ko = org.apidesign.bck2brwsr.htmlpage.Knockout.applyBindings(Index.class, this, new String[] {
    "helloMessage",
    "getHelloMessage__Ljava_lang_String_2",
    null,
    "getHelloMessage",
    "name",
    "getName__Ljava_lang_String_2",
    "setName__VLjava_lang_String_2",
    "getName"
  });
  return this;
}
public void triggerEvent(Element e, OnEvent ev) {
  org.apidesign.bck2brwsr.htmlpage.Knockout.triggerEvent(e.getId(), ev.getElementPropertyName());
}
}
