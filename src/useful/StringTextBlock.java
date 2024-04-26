package useful;

public class StringTextBlock {

	public static void main(String[] args) {

		// """ 찍고 한줄 내리기
		String strBlock = """
				This
				is
				Text
				block
				test.
				""";

		String jsonText = """
				   {
				  "userId": 1,
				  "id": 1,
				  "title": "delectus aut autem",
				  "completed": false
				}
						""";

		String htmlText = """
								<!doctype html>
				<html dir="ltr" lang="ko"
				    chrome-refresh-2023>
				  <head>
				    <meta charset="utf-8">
				    <title>새 탭</title>
				    <style>
				      body {
				        background: #FFFFFF;
				        margin: 0;
				      }
								""";

		// html, json 문자열을 만드는데 유용하게 사용할 수 있음

	} // end of main

} // end of class
