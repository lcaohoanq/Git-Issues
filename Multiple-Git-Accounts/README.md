- Generate SSH key
```bash
ssh-keygen -t rsa -C "your-email@example.com"
```
- After that, the key will in ~/.ssh/
- Add `.pub` key to github, and the other using below command

```bash
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_ed25519
ssh-add ~/.ssh/id_rsa_hoangdz1604
```
- verify the connection
```bash
ssh -T git@hoangclw
ssh -T git@hoangdz1604
```
- Create ~/.ssh/config
```bash
# hoangclw@gmail.com account (lcaohoanq GitHub username)
Host github-hoangclw
  HostName github.com
  User git
  IdentityFile ~/.ssh/id_ed25519  # path to your hoangclw SSH private key

# hoangdz1604@gmail.com account (hoangclw GitHub username)
Host github-hoangdz1604
  HostName github.com
  User git
  IdentityFile ~/.ssh/id_rsa_hoangdz1604  # path to your hoangdz1604 SSH private key
```

```bash
# For repositories using hoangclw@gmail.com account
cd /path/to/hoangclw/repository
git remote set-url origin git@github-hoangclw:username/repository.git

# For repositories using hoangdz1604@gmail.com account
cd /path/to/hoangdz1604/repository
git remote set-url origin git@github-hoangdz1604:username/repository.git
```
