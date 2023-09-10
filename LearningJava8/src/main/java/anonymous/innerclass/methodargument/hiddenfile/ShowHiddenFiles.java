package anonymous.innerclass.methodargument.hiddenfile;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class ShowHiddenFiles{

	public static void main(String[] args) {
		File allfiles = new File("C:\\Users\\lap\\git\\LearningJava8\\LearningJava8\\FilesCollection");

		File[] hiddenFiles = allfiles.listFiles(new FileFilter() { // list file implementation is given below

			@Override
			public boolean accept(File pathname) {
			System.out.println("inside accet method");
				return pathname.isHidden();
			}


		});

		for (File file : hiddenFiles) {
			System.out.println(file.getName());
		}
	}


}

//public File[] listFiles(FileFilter filter) {
//    String ss[] = normalizedList();
//    if (ss == null) return null;
//    ArrayList<File> files = new ArrayList<>();
//    for (String s : ss) {
//        File f = new File(s, this);
//        if ((filter == null) || filter.accept(f))
//            files.add(f);
//    }
//    return files.toArray(new File[files.size()]);
//}




