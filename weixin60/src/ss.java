/*
 * 
 * @Override protected Parcelable onSaveInstanceState() { Log.e("shen",
 * "onSaveInstanceState"); Bundle bundle = new Bundle();
 * bundle.putParcelable(INSTANCE_STATUS, super.onSaveInstanceState());
 * bundle.putFloat(ALPHA_STATUS, mAlpha); return bundle; }
 * 
 * @Override protected void onRestoreInstanceState(Parcelable state) {
 * Log.e("shen", "onSaveInstanceState"); if (state instanceof Bundle) {
 * super.onRestoreInstanceState(((Bundle) state)
 * .getParcelable(INSTANCE_STATUS)); mAlpha = ((Bundle)
 * state).getFloat(ALPHA_STATUS); return; } super.onRestoreInstanceState(state);
 * }
 */