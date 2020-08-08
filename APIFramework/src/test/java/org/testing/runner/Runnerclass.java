package org.testing.runner;

import java.io.IOException;

import org.testing.testscripts.DeleteRequestTC;
import org.testing.testscripts.GetRequestTC;
import org.testing.testscripts.GetRequestwithqueryparameters;
import org.testing.testscripts.PatchRequestTC;
import org.testing.testscripts.PostRequestTC;
import org.testing.testscripts.PutRequestTC;

public class Runnerclass {
	public static void main(String[] args) throws IOException
	{
		PostRequestTC post=new PostRequestTC();
		post.TC1();
		GetRequestTC get=new GetRequestTC();
		get.TC2();
		GetRequestwithqueryparameters query=new GetRequestwithqueryparameters();
		query.TC3();
		PutRequestTC put=new PutRequestTC();
		put.TC4();
		DeleteRequestTC del=new DeleteRequestTC();
		del.TC5();
		PatchRequestTC pat=new PatchRequestTC();
		pat.TC6();




		
	}

}
