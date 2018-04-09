package main.java;

public final class Item {
        private int _key;
        //constructor
        public Item(int keyValue) { 
                _key = keyValue;
        }
        // further components and methods 
        
        public int getKey() {
        	return _key;
        }
        
        public void setKey(int keyValue) {
        	_key = keyValue;
        }
}
