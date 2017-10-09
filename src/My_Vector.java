
public class My_Vector {
	public void push_back(int i){
		if (mNextFree>=mObjects.length)
			resize();
		mObjects[mNextFree++] = i;
	}
	public int vector_length(){
		return mObjects.length;
	}
	public int vector_int(int i){
		return mObjects[i];
	}
	public void pop_back(){
		for(int i = 0; i<mObjects.length; ++i){
			if(i+1 < mObjects.length){
				mObjects[i] = mObjects[i+1];
			}
			else
				;
		}
		mNextFree = mNextFree - 1;
		if (mNextFree <= mObjects.length/2){
			shrink();
		}
	}
	private void resize(){
		int[] newObjects = new int[mObjects.length * 2];
		for(int i = 0; i<mObjects.length;++i)
			newObjects[i] = mObjects[i];
		mObjects = newObjects;
	}
	private void shrink(){
		int[] newObjects = new int[mObjects.length/2];
		for(int i = 0; i<newObjects.length; ++i){
			newObjects[i] = mObjects[i];
		}
		mObjects = newObjects;
	}
	private int[] mObjects = new int[1];
	private int mNextFree = 0;
}
