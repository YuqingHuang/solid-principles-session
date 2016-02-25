class Rectangle
{
	protected int m_width;
	protected int m_height;

	public void setWidth(int width){
		m_width = width;
	}

	public void setHeight(int height){
		m_height = height;
	}

	public int getArea(){
		return m_width * m_height;
	}	
}
