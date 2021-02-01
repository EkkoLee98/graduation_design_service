package io.renren.modules.arct.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author zes
 * @email 779732613@qq.com
 * @date 2021-02-01 01:56:04
 */
@Data
@TableName("author")
public class AuthorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String authorName;
	/**
	 * 
	 */
	private String avatar;
	/**
	 * 
	 */
	private Integer status;
	/**
	 * 
	 */
	private String articleIds;
	/**
	 * 
	 */
	private String articleLikesIds;
	/**
	 * 
	 */
	private String authorLikesIds;
	/**
	 * 
	 */
	private String motto;
	/**
	 * 
	 */
	private String fansCount;
	/**
	 * 
	 */
	private String followCount;
	/**
	 * 
	 */
	private String gender;
	/**
	 * 
	 */
	private String integralCount;
	/**
	 * 
	 */
	private String professional;
	/**
	 * 
	 */
	private String thumpsUpArticleIds;
	/**
	 * 
	 */
	private String labelIds;

}
