/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package xianjie.shen.weixin60;

public final class R {
    public static final class attr {
        /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int color=0x7f010000;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int icon=0x7f010003;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int text=0x7f010001;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int text_size=0x7f010002;
    }
    public static final class dimen {
        /**  Default screen margins, per the Android Design guidelines. 

         Customize dimensions originally defined in res/values/dimens.xml (such as
         screen margins) for sw720dp devices (e.g. 10" tablets) in landscape here.
    
         */
        public static final int activity_horizontal_margin=0x7f040000;
        public static final int activity_vertical_margin=0x7f040001;
    }
    public static final class drawable {
        public static final int actionbar_add_icon=0x7f020000;
        public static final int actionbar_search_icon=0x7f020001;
        public static final int ic_launcher=0x7f020002;
        public static final int ic_menu_allfriends=0x7f020003;
        public static final int ic_menu_emoticons=0x7f020004;
        public static final int ic_menu_friendslist=0x7f020005;
        public static final int ic_menu_start_conversation=0x7f020006;
        public static final int menu_add_icon=0x7f020007;
        public static final int menu_feedback_icon=0x7f020008;
        public static final int menu_group_chat_icon=0x7f020009;
        public static final int menu_scan_icon=0x7f02000a;
        public static final int tab_address_normal=0x7f02000b;
        public static final int tab_bg=0x7f02000c;
        public static final int tab_find_frd_normal=0x7f02000d;
        public static final int tab_settings_normal=0x7f02000e;
        public static final int tab_weixin_normal=0x7f02000f;
    }
    public static final class id {
        public static final int actionbar_search=0x7f080006;
        public static final int id_button=0x7f080000;
        public static final int id_tabView01=0x7f080002;
        public static final int id_tabView02=0x7f080003;
        public static final int id_tabView03=0x7f080004;
        public static final int id_tabView04=0x7f080005;
        public static final int id_viewPager=0x7f080001;
        public static final int menu_addfriend=0x7f080008;
        public static final int menu_feedback=0x7f08000a;
        public static final int menu_group_chat=0x7f080007;
        public static final int menu_scan=0x7f080009;
    }
    public static final class layout {
        public static final int activity_main=0x7f030000;
        public static final int layout_tab=0x7f030001;
    }
    public static final class menu {
        public static final int main=0x7f070000;
    }
    public static final class string {
        public static final int actionbar_add=0x7f050002;
        public static final int actionbar_name=0x7f050000;
        public static final int actionbar_search=0x7f050001;
        public static final int menu_addfriend=0x7f050004;
        public static final int menu_feedback=0x7f050006;
        public static final int menu_group_chat=0x7f050003;
        public static final int menu_scan=0x7f050005;
        public static final int tab_contact=0x7f050007;
        public static final int tab_found=0x7f050008;
        public static final int tab_me=0x7f050009;
    }
    public static final class style {
        /** 
        Base application theme, dependent on API level. This theme is replaced
        by AppBaseTheme from res/values-vXX/styles.xml on newer devices.
    

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        

        Base application theme for API 11+. This theme completely replaces
        AppBaseTheme from res/values/styles.xml on API 11+ devices.



    

        Base application theme for API 14+. This theme completely replaces
        AppBaseTheme from BOTH res/values/styles.xml and
        res/values-v11/styles.xml on API 14+ devices.



    
         */
        public static final int AppBaseTheme=0x7f060000;
        /**  Application theme. 
 All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f060001;
        public static final int weixinActionOverflowButtonStyle=0x7f060002;
    }
    public static final class styleable {
        /** Attributes that can be used with a tab_view.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #tab_view_color xianjie.shen.weixin60:color}</code></td><td></td></tr>
           <tr><td><code>{@link #tab_view_icon xianjie.shen.weixin60:icon}</code></td><td></td></tr>
           <tr><td><code>{@link #tab_view_text xianjie.shen.weixin60:text}</code></td><td></td></tr>
           <tr><td><code>{@link #tab_view_text_size xianjie.shen.weixin60:text_size}</code></td><td></td></tr>
           </table>
           @see #tab_view_color
           @see #tab_view_icon
           @see #tab_view_text
           @see #tab_view_text_size
         */
        public static final int[] tab_view = {
            0x7f010000, 0x7f010001, 0x7f010002, 0x7f010003
        };
        /**
          <p>This symbol is the offset where the {@link xianjie.shen.weixin60.R.attr#color}
          attribute's value can be found in the {@link #tab_view} array.


          <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name xianjie.shen.weixin60:color
        */
        public static final int tab_view_color = 0;
        /**
          <p>This symbol is the offset where the {@link xianjie.shen.weixin60.R.attr#icon}
          attribute's value can be found in the {@link #tab_view} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name xianjie.shen.weixin60:icon
        */
        public static final int tab_view_icon = 3;
        /**
          <p>This symbol is the offset where the {@link xianjie.shen.weixin60.R.attr#text}
          attribute's value can be found in the {@link #tab_view} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name xianjie.shen.weixin60:text
        */
        public static final int tab_view_text = 1;
        /**
          <p>This symbol is the offset where the {@link xianjie.shen.weixin60.R.attr#text_size}
          attribute's value can be found in the {@link #tab_view} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name xianjie.shen.weixin60:text_size
        */
        public static final int tab_view_text_size = 2;
    };
}
