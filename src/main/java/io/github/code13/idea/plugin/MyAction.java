package io.github.code13.idea.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * MyAction.
 *
 * @author <a href="https://github.com/Code-13/">code13</a>
 * @date 11/29/2021 9:47 AM
 */
public class MyAction extends AnAction {

  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
    Project project = e.getData(PlatformDataKeys.PROJECT);
    PsiFile psiFile = e.getData(CommonDataKeys.PSI_FILE);

    String path = psiFile.getVirtualFile().getPath();

    Messages.showMessageDialog(
        project,
        "guide-idea-plugin-create-project-by-gradle: " + path,
        "Hi IDEA Plugin",
        Messages.getInformationIcon());
  }
}
