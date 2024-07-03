package Basic_Language.CustomImmutableClass;

class Test{
	private int i;
	
	Test(int i){
		this.i = i;
	}
	
	public Test modify(int i){
		if(this.i == i){
			return this;
		}else{
			return new Test(i);
		}
	}
}

/**
 * Test t1 = new Test(10);

Test t2 = t1.modify(100);

Test t3 = t1.modify(10);

t1------|
	|------i = 10
t3------|

t2------->i = 100


sopln(t1 == t2);	//false

sopln(t1 == t3);	//true
 */