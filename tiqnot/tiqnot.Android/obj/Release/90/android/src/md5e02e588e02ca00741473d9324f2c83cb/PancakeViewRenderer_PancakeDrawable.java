package md5e02e588e02ca00741473d9324f2c83cb;


public class PancakeViewRenderer_PancakeDrawable
	extends android.graphics.drawable.Drawable
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getOpacity:()I:GetGetOpacityHandler\n" +
			"n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_setAlpha:(I)V:GetSetAlpha_IHandler\n" +
			"n_setColorFilter:(Landroid/graphics/ColorFilter;)V:GetSetColorFilter_Landroid_graphics_ColorFilter_Handler\n" +
			"n_onStateChange:([I)Z:GetOnStateChange_arrayIHandler\n" +
			"";
		mono.android.Runtime.register ("Xamarin.Forms.PancakeView.Droid.PancakeViewRenderer+PancakeDrawable, Xamarin.Forms.PancakeView", PancakeViewRenderer_PancakeDrawable.class, __md_methods);
	}


	public PancakeViewRenderer_PancakeDrawable ()
	{
		super ();
		if (getClass () == PancakeViewRenderer_PancakeDrawable.class)
			mono.android.TypeManager.Activate ("Xamarin.Forms.PancakeView.Droid.PancakeViewRenderer+PancakeDrawable, Xamarin.Forms.PancakeView", "", this, new java.lang.Object[] {  });
	}


	public int getOpacity ()
	{
		return n_getOpacity ();
	}

	private native int n_getOpacity ();


	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);


	public void setAlpha (int p0)
	{
		n_setAlpha (p0);
	}

	private native void n_setAlpha (int p0);


	public void setColorFilter (android.graphics.ColorFilter p0)
	{
		n_setColorFilter (p0);
	}

	private native void n_setColorFilter (android.graphics.ColorFilter p0);


	public boolean onStateChange (int[] p0)
	{
		return n_onStateChange (p0);
	}

	private native boolean n_onStateChange (int[] p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
