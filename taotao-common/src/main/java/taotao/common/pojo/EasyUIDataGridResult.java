package taotao.common.pojo;

import java.util.List;

/**
* Title: EasyUIDataGridResult
* Description: easyUI返回数据包装类
* Version:1.0.0  
* @author Administrator
* @date 2019年1月7日
*/
public class EasyUIDataGridResult {
	private long total;
	private List<?> rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
	
}
